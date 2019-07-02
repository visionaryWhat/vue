package com.elm.vue.service.impl;

import com.elm.vue.entity.Shop;
import com.elm.vue.mapper.ShopMapper;
import com.elm.vue.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;

public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopMapper shopMapper;

    @Override
    public int add(Shop shop) {
        return shopMapper.add(shop);
    }
}
