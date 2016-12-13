package com.bao.model;

import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created by asus on 2016/12/13.
 */
@Document(indexName = "book")
public class Book {
    String name;

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Integer price;



}
