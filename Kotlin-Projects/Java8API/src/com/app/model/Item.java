package com.app.model;

import java.math.BigDecimal;

public class Item {
    private Integer id;
    private String name;
    private int qty;
    private BigDecimal price;

    public Item(Integer id, String name, int qty, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public Item() {

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

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }

    public void printAllItem(Book book){

    }
}
