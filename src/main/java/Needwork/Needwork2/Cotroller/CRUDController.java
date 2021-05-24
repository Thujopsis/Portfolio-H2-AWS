package Needwork.Needwork2.Cotroller;

import Needwork.Needwork2.Mapper.ListDataMapper;
import Needwork.Needwork2.Model.FormModel;
import Needwork.Needwork2.Model.ListDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/*
CRUD処理の本体となるクラス
各処理の実際の処理をメソッド内で記述する
 */
@Controller
public class CRUDController {

    @Autowired
    ListDataMapper listDataMapper;

    //追加処理本体
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public String create(@ModelAttribute FormModel formModel, Model model){
        listDataMapper.insert(formModel);
        return "redirect:/join";
    }

    //編集処理本体
    @Transactional(readOnly = false)
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(@ModelAttribute ListDataModel listDataModel, Model model){
        listDataMapper.update(listDataModel);
        return "redirect:/join";
    }

    //削除処理本体
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.POST)
    public String delete(@PathVariable int id,Model model){
        listDataMapper.delete(id);
        return "redirect:/join";
    }
}
