package Needwork.Needwork2.Model;

import org.apache.commons.lang3.StringUtils;
import org.springframework.lang.NonNull;

import java.io.Serializable;

/*
IDを除くフォームの要素を格納するモデル
ID以外の要素をやり取りする場合はこちらを使用する。
 */
public class FormModel implements Serializable {

    private static final long serialVersionUID = -3430611959303745513L;

    @NonNull
    private String name = StringUtils.EMPTY;

    @NonNull
    private String details = StringUtils.EMPTY;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
