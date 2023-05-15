package com.seolandchildren;

import java.util.Random;

public class Takebreak {
    int str;
    int dex;
    int hp;

    public Takebreak(int str, int dex, int hp) {
        this.str = str;
        this.dex = dex;
        this.hp = hp;
    }

    public void takebreak() {
        Random random = new Random();
        int dreamType = random.nextInt(100); // 0부터 99까지의 난수 생성

        if (dreamType < 10) {
            System.out.println("악몽을 꿨습니다. 스텟이 대폭 하락합니다.");
            int statToDecrease = random.nextInt(3); // 0부터 2까지의 난수 생성
            if (statToDecrease == 0) {
                str -= 10;
            } else if (statToDecrease == 1) {
                dex -= 10;
            } else {
                hp -= 10;
            }
        } else if (dreamType < 90) {
            System.out.println("잠에 들었습니다. 아무 꿈도 꾸지 않았습니다.");
            int statToIncrease = random.nextInt(3); // 0부터 2까지의 난수 생성
            if (statToIncrease == 0) {
                str += 1;
            } else if (statToIncrease == 1) {
                dex += 1;
            } else {
                hp += 1;
            }
        } else {
            System.out.println("돼지 꿈을 꿨습니다. 스텟이 대폭 상승합니다!");
            int statToIncrease = random.nextInt(3); // 0부터 2까지의 난수 생성
            if (statToIncrease == 0) {
                str += 10;
            } else if (statToIncrease == 1) {
                dex += 10;
            } else {
                hp += 10;
            }
        }
    }
}
