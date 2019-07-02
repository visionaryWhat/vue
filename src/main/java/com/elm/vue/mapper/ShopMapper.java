package com.elm.vue.mapper;


import com.elm.vue.entity.Shop;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Mapper
@Repository
public interface ShopMapper {

    public int add(Shop shop);

    public Map<String,Object> queryShopById(Integer id);
}
