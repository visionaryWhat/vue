package com.elm.vue.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ShopController {

    @RequestMapping("/shops")
    public String shops(){
        System.out.println(99999999);
        System.out.println(99999999);
        System.out.println(99999999);
        return "/shop";
    }

}
