package com.seolandchildren.menu.battle;

public class Guard {
    public int guard(int hp, int attack){  //방어시 공격 받은 HP값을 반환
        return hp - (int)(attack*0.2);
    }
}
