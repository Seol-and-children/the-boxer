package com.seolandchildren;

public class StatCheck {
    String name;
    int strength;
    int agility;
    int stamina;
    int money;

    @Override
    public String toString() {
        return "=============== 스탯 확인 ===============" +
                "\n이름 : " + name +
                "\n힘 : " + strength +
                "\n민첩 : " + agility +
                "\n체력 : " + stamina +
                "\n보유 금액 : " + money +
                "======================================";
    }

    public void checkStat(Player player) {
        name = player.getName();
        strength = player.getStrength();
        agility = player.getAgility();
        stamina = player.getStamina();
        money = player.getMoney();
    }
}
