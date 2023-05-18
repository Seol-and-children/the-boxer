package com.seolandchildren.menu;

import com.seolandchildren.Player;
import com.seolandchildren.menu.battle.StartBattle;
import com.seolandchildren.menu.shop.Shop;
import com.seolandchildren.menu.training.Training;

import java.util.Scanner;

import static com.seolandchildren.menu.battle.StartBattle.enemyOrder;

public class Menu {
    private int turnsLeft = 48;    // 남은 턴

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

        while (turnsLeft > 0) {
            System.out.println("=============== THE BOXER ===============");
            System.out.println("“최고의 복서를 꿈꾸는 당신, 더 복서를 통해 실현하세요!”");
            System.out.println("                              남은 턴: " + turnsLeft + "/48");
            System.out.println("1. 시합 참가하기(1턴 소요)");
            System.out.println("2. 훈련하기 (1턴 소요)");
            System.out.println("3. 아르바이트 (1턴 소요)");
            System.out.println("4. 휴식하기 (1턴 소요)");
            System.out.println("5. 상점 방문하기");
            System.out.println("6. 스탯 확인");
            System.out.println("=========================================");
            System.out.print("이번 턴에 진행할 기능 번호를 입력하세요 : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    StartBattle startBattle = new StartBattle(enemyOrder, player);
                    startBattle.startBattle();
                    turnsLeft -= 1;
                    break;
                case 2:
                    Training training = new Training(player);
                    training.training();
                    turnsLeft -= 1;
                    break;
                case 3:
                    PartTimeJob partTimeJob = new PartTimeJob(player);
                    partTimeJob.partTimeJob();
                    turnsLeft -= 1;
                    break;
                case 4:
                    Takebreak takeBreak = new Takebreak(player);
                    takeBreak.takeBreak();
                    turnsLeft -= 1;
                    break;
                case 5:
                    Shop shop = new Shop(player);
                    shop.purchase();
                    break;
                case 6:
                    StatCheck statCheck = new StatCheck();
                    statCheck.checkStat(player);
                    System.out.println(statCheck);
                    break;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다. 다시 입력해주세요.");
            }
            System.out.println();
        }
        System.out.println("게임 종료: 턴을 모두 소비하였습니다.");
    }
}