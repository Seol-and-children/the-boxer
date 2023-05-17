package com.seolandchildren;

public class Attack {
    public int attack(int Hp, int attack){  //공격 받은 HP값을 반환
        int finalHp = Hp - attack;
        return finalHp;
    }
}
