package com.seolandchildren;

public class Guard {
    public int guard(int Hp, int attack){
        int finalHp = Hp - (int)(attack*0.2);
        return finalHp;
    }
}