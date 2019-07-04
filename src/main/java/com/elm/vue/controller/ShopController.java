package com.elm.vue.controller;


import com.elm.vue.entity.Shop;
import com.elm.vue.service.ShopService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ShopController {

    @Autowired
    private ShopService shopService;

    /**
     * 页面跳转
     * @return
     */
    @GetMapping("shops.html")
    public ModelAndView shops(){
        return new ModelAndView("shop");
    }

    @PostMapping("/shop")
    public String addShop(@RequestBody Shop shop){
        return String.valueOf(shopService.addShop(shop));
    }

    /**
     * 分页
     * @param start
     * @param size
     * @return
     */
    @GetMapping("/shops")
    public Map<String,Object> queryShops(@RequestParam(value = "start",defaultValue = "1") int start,@RequestParam(value = "size",defaultValue = "5") int size){
        PageHelper.startPage(start,size,"time desc");
        List<Map<String, Object>> shops = shopService.queryShops();
        List<Map<String, Object>> shops2 = shopService.queryShops();

        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(shops,5);
        System.out.println(pageInfo);
        Map<String,Object> map = new HashMap<>();
        map.put("pageInfo",pageInfo);
        map.put("list",shops2);
        return map;
    }


    @DeleteMapping("/shops/{id}")
    public String remove(@PathVariable Integer id){
        shopService.removeShopById(id);
        return "success";
    }

}
