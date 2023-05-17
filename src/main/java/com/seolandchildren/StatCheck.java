package com.seolandchildren;

import com.seolandchildren.shop.Item;

public class StatCheck {
    String name;
    int strength;
    int agility;
    int stamina;
    int money;
    Item equipment;

    public void checkStat(Player player) {
        name = player.getName();
        strength = player.getStrength();
        agility = player.getAgility();
        stamina = player.getStamina();
        money = player.getMoney();
        equipment = player.getEquipment();
    }

    @Override
    public String toString() {
        return "=============== 스탯 확인 ===============" +
                "\n이름 : " + this.name +
                "\n힘 : " + this.strength +
                "\n민첩 : " + this.agility +
                "\n체력 : " + this.stamina +
                "\n보유 금액 : " + this.money +
                "\n장착중인 장비 : " + this.equipment.getName() + " (힘 +" + this.equipment.getAttack() + ")" +
                "\n========================================";
    }
}
