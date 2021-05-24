package Needwork.Needwork2.Model;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

/*
IDを含む全要素をやり取りするためのモデル
リスト内のデータを列挙する形で記述する。
 */
public class ListDataModel {
    private int id = NumberUtils.INTEGER_ZERO;
    private String name = StringUtils.EMPTY;
    private String details = StringUtils.EMPTY;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
