package com.elm.vue.controller;


import com.elm.vue.entity.Shop;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShopController {

    @RequestMapping("/shops")
    public String shops(){

        return "/shop";
    }

    @PostMapping("/shop")
    public String add(@RequestBody Shop shop){

            return "success";
    }

}
