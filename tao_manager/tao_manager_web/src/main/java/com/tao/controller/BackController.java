package com.tao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by txf on 2016-09-17.
 */
@Controller
public class BackController {

   @RequestMapping("/toIndexPage")
    public  String toIndexPage(){
        return  "index";
    }
}
