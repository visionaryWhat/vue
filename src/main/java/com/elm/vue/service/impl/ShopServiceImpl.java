package com.elm.vue.service.impl;

import com.elm.vue.entity.Shop;
import com.elm.vue.mapper.ShopMapper;
import com.elm.vue.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopMapper shopMapper;

    @Override
    public int addShop(Shop shop) {
        Map<String, Object> stringObjectMap = shopMapper.queryShopById(shop.getId());
        if(stringObjectMap!=null&&stringObjectMap.size()!=0){
            return  -1;
        }
        System.out.println(shop);
        return shopMapper.addShop(shop);
    }

    public List<Map<String,Object>> queryShops(String name){
        return  shopMapper.queryShops(name);
    }

    public Integer removeShopById(Integer id){
        return shopMapper.removeShopById(id);
    }


}
