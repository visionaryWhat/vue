package com.elm.vue.service;

import com.elm.vue.entity.Shop;

import java.util.List;
import java.util.Map;

public interface ShopService {

     int addShop(Shop shop);

    List<Map<String,Object>> queryShops(String name);

    Integer removeShopById(Integer id);

}
