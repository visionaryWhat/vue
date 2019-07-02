package com.elm.vue.mapper;


import com.elm.vue.entity.Shop;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShopMapper {

    public int add(Shop shop);
}
