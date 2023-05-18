package com.seolandchildren.menu;

import com.seolandchildren.Player;

import java.util.Random;

public class PartTimeJob {
    private final Player player;
    private int dollar;

    public PartTimeJob(Player player) {
        this.player = player;
        this.dollar = player.getMoney();
    }

    public void partTimeJob() {
        Random random = new Random();
        int chance = random.nextInt(3);

        System.out.println("아르바이트 진행중...");

        try {
            Thread.sleep(1000);
            System.out.println("아르바이트 진행중...");

            Thread.sleep(1000);
            System.out.println("아르바이트 진행중...");

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        switch (chance) {
            case 0:
                System.out.println("당신은 아르바이트 왕! 보너스를 포함하여 $200를 받습니다.");
                dollar += 200;
                break;
            case 1:
                System.out.println("성실하게 아르바이트에 참여했습니다. 평범하게 $150를 받습니다.");
                dollar += 150;
                break;
            case 2:
                System.out.println("피로가 누적된 당신... 사고만 치고 말았습니다... $100를 받습니다.");
                dollar += 100;
                break;
        }

        System.out.println("현재 소지한 돈: $" + dollar);
        player.setMoney(dollar);
    }
}