package com.seolandchildren;

import com.seolandchildren.menu.Naming;
import com.seolandchildren.menu.shop.Item;

public class Player {
    private int strength; // 힘
    private int agility; // 민첩
    private int stamina; // 체력
    private Item equipment;
    private int money; // 자금
    private String name;

    public Player() {
        name = Naming.playerName;
        strength = 10;
        agility = 10;
        stamina = 100;
        equipment = new Item("맨 주먹", 0, 0); // 초기 장비
        money = 10000;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getStamina() {
        return stamina;
    }

    public int getMoney() {
        return money;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public Item getEquipment() {
        return equipment;
    }

    public void setEquipment(Item equipment) {
        this.equipment = equipment;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}