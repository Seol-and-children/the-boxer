package com.seolandchildren;

public class Rival {

    private static final String[] rivalname = { "\"원순이\"박형준", "\"스컬\"한지석", "\"속도와 중량\"설광진", "\"두개의 발\"정건희", "\"제천대성\"박형준"};
    private static final int[] rivalAttack  = { 20, 30, 30, 60, 100};
    private static final int[] rivalAgility = { 10, 30, 40, 50, 60 };
    private static final int[] rivalHealth = { 100, 150, 200, 300, 500 };

    private static Rival instance;
    private String name;
    private int attack;
    private int agility;
    private int health;

    private void setHealth(int i) {
    }

    private void setAgility(int i) {
        
    }

    private void setAttack(int i) {
        
    }

    private void setName(String s) {
    }

    public Rival(String name, int attack, int agility, int health) {
        this.name = name;
        this.attack = attack;
        this.agility = agility;
        this.health = health;
    }

    public static Rival getInstance(String name, int attack, int agility, int health) {
        if (instance == null) {
            instance = new Rival(name, attack, agility, health);
        }
        return instance;
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

}
