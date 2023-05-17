package com.seolandchildren.training;

import com.seolandchildren.Player;

public class AttackTraining {

    private Player player;

    public AttackTraining(Player player) {
        this.player = player;
    }

    public void attackTraining() {

        System.out.println("플레이어의 현재 힘 스탯 :" + player.getStrength());
        System.out.println("샌드백 치기 훈련을 합니다.. \n 힘 스탯이 5 증가합니다.");

        player.setStrength(player.getStrength() + 5);   //플레이이의 공격력 5 성장
        System.out.println("플레이어의 현재 힘 스탯 :" + player.getStrength());
    }

}
