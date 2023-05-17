package com.seolandchildren;
import java.util.Scanner;

public class Naming {
    public void naming() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============== THE BOXER ===============\n");
        System.out.println("텍스트 기반 성장형 게임인 ‘더 복서’ 에 오신 것을 환영합니다.");
        System.out.print("게임을 시작하기에 앞서서 플레이어의 이름을 설정해주세요: ");
        String playerName = scanner.nextLine();
        System.out.println("플레이어의 이름이 " + playerName + "으로 설정되었습니다. 게임을 시작합니다.");
    }

    // 테스트를 위한 main 메서드
    public static void main(String[] args) {
        Naming naming = new Naming();
        naming.naming();
    }
}
