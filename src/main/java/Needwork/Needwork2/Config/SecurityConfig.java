package Needwork.Needwork2.Config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/*
SpringSecurityの設定を記述するクラス
ログインしていない場合に遷移できる画面等をここで指定する
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) throws Exception {
        web
                .ignoring()
                .antMatchers("/resources/**", "/static/**","/webjars/**");
    }


    @Override
    protected void configure(HttpSecurity web)throws Exception{
        web.authorizeRequests()
                .antMatchers("/home","/login-error")
                .permitAll()
                .anyRequest()
                .authenticated();

        web.formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/join")
                .failureUrl("/login-error")
                .permitAll();
    }
}
