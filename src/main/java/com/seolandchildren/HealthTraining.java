package com.seolandchildren;

public class HealthTraining {
    public void healthTraining() {
        Player player = new Player();

        System.out.println("플레이어의 현재 체력 스탯 :" + player.getStamina());
        System.out.println("달리기 훈련을 합니다.. \n 체력 스탯이 10 증가합니다.");

        player.setStamina(player.getStamina()+10);
        System.out.println("플레이어의 현재 힘 스탯 :" + player.getStamina());
    }
}
