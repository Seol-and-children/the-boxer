package com.seolandchildren;

public class StatCheck {
    String name;
    int strength;
    int agility;
    int stamina;
    int money;

    public void checkStat(Player player) {
        name = player.getName();
        strength = player.getStrength();
        agility = player.getAgility();
        stamina = player.getStamina();
        money = player.getMoney();
    }

    @Override
    public String toString() {
        return "=============== 스탯 확인 ===============" +
                "\n이름 : " + this.name +
                "\n힘 : " + this.strength +
                "\n민첩 : " + this.agility +
                "\n체력 : " + this.stamina +
                "\n보유 금액 : " + this.money +
                "\n======================================";
    }
}
