package com.tao.controller;

import com.alibaba.druid.sql.ast.expr.SQLCaseExpr;
import com.tao.pojo.TbItem;
import com.tao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by txf on 2016-09-17.
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable long itemId){
         TbItem tbItem=itemService.getItemById(itemId);
        return  tbItem;
    }

    @RequestMapping("/{page}")
    public  String toShowPage(@PathVariable String page ){
        List<TbItem> list=itemService.getItemList();
        return page;
    }
}
