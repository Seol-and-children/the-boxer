package com.seolandchildren.training;

import com.seolandchildren.Player;

public class HealthTraining {
    private final Player player;

    public HealthTraining(Player player) {
        this.player = player;
    }

    public void healthTraining() {
        System.out.println("플레이어의 현재 체력 스탯 :" + player.getStamina());
        System.out.println("달리기 훈련을 합니다.. \n 체력 스탯이 10 증가합니다.");

        player.setStamina(player.getStamina() + 10);
        System.out.println("플레이어의 현재 힘 스탯 :" + player.getStamina());
    }
}
