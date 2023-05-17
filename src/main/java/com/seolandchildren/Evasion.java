package com.seolandchildren;

public class Evasion {
    public int evasion(int Hp, int attack, int evoid) {
        int ran = (int)(Math.random()*100)+1;
        int finalHp;
        if (ran <= evoid){
            finalHp = Hp - (int)(attack*1.5);
            return finalHp;
        }
        else {
            return Hp;
        }
    }
}
