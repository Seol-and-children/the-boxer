package com.seolandchildren;

public class Player {
    private int strength; // 힘
    private int agility; // 민첩
    private int stamina; // 체력
    private String equipment; // 장비
    private int money; // 자금

    public Player() {
        strength = 10;
        agility = 10;
        stamina = 100;
        equipment = "맨 주먹";
        money = 100;
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

    public String getEquipment() {
        return equipment;
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

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}