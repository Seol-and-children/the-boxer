package com.seolandchildren;

import java.util.Random;

public class Takebreak {
    private Player player;
    int str;
    int dex;
    int hp;

    public Takebreak(Player player) {
        this.player = player;
        this.str = player.getStrength();
        this.dex = player.getAgility();
        this.hp = player.getStamina();
    }

    public void takeBreak() {
        Random random = new Random();
        int dreamType = random.nextInt(100); // 0부터 99까지의 난수 생성

        if (dreamType < 10) {
            System.out.println("악몽을 꿨습니다. 스텟이 대폭 하락합니다.");
            int statToDecrease = random.nextInt(3); // 0부터 2까지의 난수 생성
            if (statToDecrease == 0) {
                str -= 10;
                System.out.println("힘이 10 떨어졌습니다.");
            } else if (statToDecrease == 1) {
                dex -= 10;
                System.out.println("민첩이 10 떨어졌습니다.");
            } else {
                hp -= 10;
                System.out.println("체력이 10 떨어졌습니다.");
            }
        } else if (dreamType < 90) {
            System.out.println("잠에 들었습니다. 아무 꿈도 꾸지 않았습니다.");
            int statToIncrease = random.nextInt(3); // 0부터 2까지의 난수 생성
            if (statToIncrease == 0) {
                str += 1;
                System.out.println("힘이 1 올랐습니다.");
            } else if (statToIncrease == 1) {
                dex += 1;
                System.out.println("민첩이 1 올랐습니다.");
            } else {
                hp += 1;
                System.out.println("체력이 1 올랐습니다.");
            }
        } else {
            System.out.println("돼지 꿈을 꿨습니다. 스텟이 대폭 상승합니다!");
            int statToIncrease = random.nextInt(3); // 0부터 2까지의 난수 생성
            if (statToIncrease == 0) {
                str += 10;
                System.out.println("힘이 10 올랐습니다.");
            } else if (statToIncrease == 1) {
                dex += 10;
                System.out.println("민첩이 10 올랐습니다.");
            } else {
                hp += 10;
                System.out.println("체력이 10 올랐습니다.");
            }
        }

        player.setStrength(str);
        player.setAgility(dex);
        player.setStamina(hp);
    }
}
