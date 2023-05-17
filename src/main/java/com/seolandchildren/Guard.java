package com.seolandchildren;

public class Guard {
    public int guard(int Hp, int attack){  //방어시 공격 받은 HP값을 반환
        int finalHp = Hp - (int)(attack*0.8);
        return finalHp;
    }
}
