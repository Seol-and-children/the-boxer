package com.seolandchildren.menu.battle;

import java.util.Scanner;

public class StartBattle {
    // 이 클래스 안에서 사용될 변수들의 접근을 막기위해 private화
    private int playerHp;
    private int enemyHp;
    private int enemyAttack;
    private int playerAttack;
    private int playerAvoid;
    private int enemyAvoid;
    private int enemyCNT;
    private int takeHp;
    private String playerName;
    private String enemyName;

    public void startBattle() {
        Scanner sc = new Scanner(System.in);
        Guard gd = new Guard();
        Attack atk = new Attack();
        Evasion evs = new Evasion();
        //Player player = new Player();     플레이어 정보를 받아온다.

        playerHp = 100;
        ;      //player.getStamina();        임시
        enemyHp = 100;
        playerAttack = 20;      //player.getStrength();
        enemyAttack = 20;
        playerAvoid = 15;       //player.getAgility();
        enemyAvoid = 15;
        playerName = "설광진";      //player.getName();
        enemyName = "\'스컬\'한지석";
        enemyCNT = 0;
        do {
            if (playerHp <= 0 || enemyHp <= 0) break;
            System.out.print("\n==========\n" +
                    "1.공격\n" +
                    "2.방어\n" +
                    "3.회피\n" + "==========\n" +
                    playerName + " HP : " + playerHp + "  ||  " + enemyName + " HP : " + enemyHp + "\n==========\n" +
                    playerName + "의 행동은? : ");
            int cnt = sc.nextInt();
            enemyCNT = Ran();
            System.out.println(enemyCNT);
            switch (cnt) {
                case 1:         //플레이어가 공격을 했을 경우
                    if (enemyCNT <= 2) {           //적이 공격했을 때
                        System.out.println("==========\n" +
                                playerName + "의 공격!\t " + enemyName + "의 공격!\n" +
                                "적과 공격을 주고 받았다.\n" +
                                playerName + "이 " + enemyAttack + "의 피해를 받았다!!\n" +
                                enemyName + "이 " + playerAttack + "의 피해를 받았다!!");
                        playerHp = atk.attack(playerHp, enemyAttack);
                        enemyHp = atk.attack(enemyHp, playerAttack);
                    } else if (enemyCNT == 3) {       //적이 방어했을 때
                        takeHp = gd.guard(enemyHp, playerAttack);
                        System.out.println("==========\n" +
                                playerName + "의 공격! \t " + enemyName + "의 방어!\n" +
                                "적이 공격을 막았다.\n" +
                                enemyName + "에게 " + (enemyHp - takeHp) + "피해!!");
                        enemyHp = takeHp;
                    } else if (enemyCNT == 4) {       //적이 회피했을 때
                        String WhoHp = evs.evasion(playerHp, playerAttack, enemyHp, enemyAttack, enemyAvoid);
                        if (WhoHp.charAt(0) == '0') {
                            takeHp = Integer.valueOf(WhoHp.substring(1));
                            System.out.println("==========\n" +
                                    playerName + "의 공격!\t" + enemyName + "의 회피!\n" +
                                    "적의 공격을 회피하고 카운터를 날렸다!!" +
                                    playerName + "에게 " + (playerHp - takeHp) + "피해!!");
                            playerHp = takeHp;
                        } else {
                            takeHp = Integer.valueOf(WhoHp.substring(1));
                            System.out.println("==========\n" +
                                    playerName + "의 공격!\t" + enemyName + "의 회피!\n" +
                                    "회피에 실패했다!!" +
                                    enemyName + "에게 " + (enemyHp - takeHp) + "피해!!");
                            enemyHp = takeHp;
                        }
                    }
                    break;

                case 2:         //플레이어가 방어를 했을 경우
                    if (enemyCNT <= 2) {           //적이 공격했을 때
                        takeHp = gd.guard(playerHp, enemyAttack);
                        System.out.println("==========\n" +
                                playerName + "의 방어! \t" + enemyName + "의 공격!\n" +
                                "적의 공격을 방어했다.\n" +
                                playerName + "에게 " + (playerHp - takeHp) + "피해!!");
                        playerHp = takeHp;
                    } else if (enemyCNT == 3) {       //적이 방어했을 때
                        System.out.println("==========\n" +
                                playerName + "의 방어! \t" + enemyName + "의 방어!\n" +
                                "아무일도 일어나지 않았다.");
                    } else if (enemyCNT == 4) {       //적이 회피했을 때
                        System.out.println("==========\n" +
                                playerName + "의 방어! \t" + enemyName + "의 회피!\n" +
                                "아무일도 일어나지 않았다.");
                    }
                    break;

                case 3:         //플레이어가 회피를 했을 경우
                    if (enemyCNT <= 2) {     //적이 공격했을 때
                        String WhoHp = evs.evasion(enemyHp, enemyAttack, playerHp, playerAttack, playerAvoid);
                        if (WhoHp.charAt(0) == '0') {
                            takeHp = Integer.valueOf(WhoHp.substring(1));
                            System.out.println("==========\n" +
                                    playerName + "의 회피!\t" + enemyName + "의 공격!\n" +
                                    "적의 공격을 회피하고 카운터를 날렸다!!" +
                                    enemyName + "에게 " + (enemyHp - takeHp) + "피해!!");
                            enemyHp = takeHp;
                        } else {
                            takeHp = Integer.valueOf(WhoHp.substring(1));
                            System.out.println("==========\n" +
                                    playerName + "의 회피!\t" + enemyName + "의 공격!\n" +
                                    "회피에 실패했다!!" +
                                    playerName + "에게 " + (playerHp - takeHp) + "피해!!");
                            playerHp = takeHp;
                        }
                    } else if (enemyCNT == 3) {       //적이 방어했을 때
                        System.out.println("==========\n" +
                                playerName + "의 회피!\t" + enemyName + "의 방어!\n" +
                                "아무일도 일어나지 않았다.");
                    } else if (enemyCNT == 4) {       //적이 회피했을 때
                        System.out.println("==========\n" +
                                playerName + "의 회피!\t" + enemyName + "의 회피!\n" +
                                "아무일도 일어나지 않았다.");
                    }
                    break;
                default:
                    System.out.println("==========\n행동을 제대로 선택해 주세요.");
                    break;
            }
        } while (true);
        if (playerHp <= 0 && enemyHp > 0) System.out.println(playerName + "\n패배!!");
        else if (playerHp > 0 && enemyHp <= 0) System.out.println(playerName + "\n승리!!!!!!");
        else {
            System.out.println("\n무승부!! 리매치!!");
            startBattle();
        }
    }

    public static int Ran() {
        int num = (int) (Math.random() * 4) + 1;
        return num;
    }
}