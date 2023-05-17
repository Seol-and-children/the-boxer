package com.seolandchildren.menu.training;

import com.seolandchildren.Player;

import java.util.Scanner;

public class Training {
    private final Player player;

    public Training(Player player) {
        this.player = player;
    }

    public void training() {
        AttackTraining attackTraining = new AttackTraining(player);
        AgilityTraining agilityTraining = new AgilityTraining(player);
        HealthTraining healthTraining = new HealthTraining(player);
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("===============  훈련 목록입니다. =============== ");
            System.out.println("어떤 훈련을 하시겠습니까?");
            System.out.println("1. 공격 훈련을 하겠다!");
            System.out.println("2. 민첩 훈련을 하겠다!");
            System.out.println("3. 체력 훈련을 하겠다!");
            System.out.println("4. 훈련을 하지 않겠다!");
            System.out.println("=============== =============== =============== ");
            System.out.print("무슨 훈련을 하시겠습니까? : ");
            int no = sc.nextInt();
            switch (no){
                case 1 :
                    attackTraining.attackTraining();
                    return;
                case 2 :
                    agilityTraining.agilityTraining();
                    return;
                case 3 :
                    healthTraining.healthTraining();
                    return;
                case 4:
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
                    break;
            }
        } while (true);

    }
}
