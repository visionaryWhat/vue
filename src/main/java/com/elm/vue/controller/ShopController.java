package com.elm.vue.controller;


import com.elm.vue.entity.Shop;
import com.elm.vue.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ShopController {

    @Autowired
    private ShopService shopService;

    @RequestMapping("/shops")
    public String shops(){

        return "shop";
    }

    @PostMapping("/shop")
    @ResponseBody
    public String add(@RequestBody Shop shop){
        System.out.println(shop);
        return String.valueOf(shopService.add(shop));
    }

}
