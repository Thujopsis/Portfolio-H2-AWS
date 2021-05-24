package Needwork.Needwork2.Cotroller;

import Needwork.Needwork2.Mapper.ListDataMapper;
import Needwork.Needwork2.Model.ListDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/*
トップ画面からの遷移、及びエラー時のルーティングを行うクラス
画面遷移のみ行い、CRUDのRのみ、画面表示に必要な最低限の処理のみを行う
 */
@Controller
public class IndexController {

    @Autowired
    ListDataMapper listDataMapper;

    //ルートに遷移した場合はhomeへリダイレクトする。
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(Model model){
        return "redirect:/home";
    }

    //TOP画面
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(Model model){
       List<ListDataModel> dataList = listDataMapper.selectAll();
       model.addAttribute("dataList",dataList);
        return "index";
    }

    //ログイン画面への遷移
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(Model model){
        model.addAttribute("iserror",false);
        return "login";
    }

    //ログイン失敗時
    @RequestMapping(value = "/login-error",method = RequestMethod.GET)
    public String loginError(Model model){
        model.addAttribute("iserror",true);
        return "login";
    }

    //ログイン後画面
    @RequestMapping(value = "/join",method = RequestMethod.GET)
    public String join(Model model){
        model.addAttribute("iserror",false);

        List<ListDataModel> dataList = listDataMapper.selectAll();
        model.addAttribute("dataList",dataList);
        return "join";
    }

}
