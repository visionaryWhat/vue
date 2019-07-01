package com.elm.vue.entity;

import javax.persistence.*;

@Entity
public class Shop {

    @Id
    @Column(length = 4)
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer id;
    @Column(length = 10)
    private String name;
    @Column(length = 30)
    private String time;

    public Shop() {
    }

    public Shop(String name, String time) {
        this.name = name;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
