package com.seolandchildren.menu;

public class Rival {

    private String[] rivalname = {"\"원숭이\"박형준", "\"스컬\"한지석", "\"속도와 중량\"설광진", "\"두개의 발\"정건희", "\"제천대성\"박형준"};
    private int[] rivalAttack = {20, 30, 30, 60, 100};
    private int[] rivalAgility = {10, 30, 40, 50, 60};
    private int[] rivalHealth = {100, 150, 200, 300, 500};
    private int[] rivalMoney = {300, 500, 1000, 2000, 1000000};

    private static Rival instance;
    private String name;
    private int attack;

    private int agility;
    private int health;
    private int money;

    private void setHealth(int i) {
    }

    private void setAgility(int i) {

    }

    private void setAttack(int i) {

    }

    private void setName(String s) {
    }

    public void setRivalMoney(int[] rivalMoney) {
        this.rivalMoney = rivalMoney;
    }
    public Rival(int order) {
        this.name = rivalname[order];
        this.attack = rivalAttack[order];
        this.agility = rivalAgility[order];
        this.health = rivalHealth[order];
        this.money = rivalMoney[order];
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getAgility() {
        return agility;
    }

    public int getHealth() {
        return health;
    }

    public int[] getRivalMoney() {
        return rivalMoney;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
