package com.elm.vue.service.impl;

import com.elm.vue.entity.Shop;
import com.elm.vue.mapper.ShopMapper;
import com.elm.vue.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopMapper shopMapper;

    @Override
    public int add(Shop shop) {
        Map<String, Object> stringObjectMap = shopMapper.queryShopById(shop.getId());
       /* if(stringObjectMap!=null&&stringObjectMap.size()!=0){
            return  shopMapper.add(shop);
        }*/
            return -1;
    }


}
