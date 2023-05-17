package com.seolandchildren.menu.battle;

public class Evasion {
    public String evasion(int attackerHp, int attackerAttack, int takeHp, int takeAttack, int avoid) {
        int ran = (int) (Math.random() * 100) + 1;
        int finalHp;
        String WhoHp;
        if (ran <= avoid) {
            finalHp = attackerHp - (int)(takeAttack * 1.5);
            WhoHp = "0" + finalHp;
            System.out.println(WhoHp);
            return WhoHp;
        }
        else {
            finalHp = takeHp - attackerAttack;
            WhoHp = "1" + finalHp;
            System.out.println(WhoHp);
            return WhoHp;
        }
    }
}
