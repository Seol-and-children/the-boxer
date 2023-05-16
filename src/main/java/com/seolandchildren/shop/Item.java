package com.seolandchildren.shop;

public class Item {
    private String name;
    private int attack;
    private int price;

    public Item(String name, int attack, int price) {
        this.name = name;
        this.attack = attack;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getPrice() {
        return price;
    }
}