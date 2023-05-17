package com.seolandchildren.training;

import com.seolandchildren.Player;

public class AgilityTraining {
    public void agilityTraining(){
        Player player = new Player();

        System.out.println("플레이어의 현재 민첩 스탯 :" + player.getAgility());
        System.out.println("야구공 피하기 훈련을 합니다.. \n 민첩 스탯이 2 성장합니다.");

        player.setAgility(player.getAgility()+2);
        System.out.println("플레이어의 현재 민첩 스탯 :" + player.getAgility());
    }

}
