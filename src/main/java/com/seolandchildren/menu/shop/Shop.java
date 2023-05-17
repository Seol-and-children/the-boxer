package com.seolandchildren.menu.shop;

import com.seolandchildren.Player;

import java.util.Scanner;

public class Shop {
    private Player player;
    private int money;
    private Item equippedItem; // 초기장비

    public Shop(Player player) {
        this.player = player;
        this.money = player.getMoney();
        this.equippedItem = player.getEquipment();
    }

    public void purchase() {
        while (true) {
            System.out.println("=============== 상점 ===============");
            System.out.println("      상품명       |  공격력   |   가격");
            System.out.println("1. 누더기 글러브    |    5     |   300$");
            System.out.println("2. 평범한 글러브    |    10    |   500$");
            System.out.println("3. 시멘트 글러브    |    50    |   1500$");
            System.out.println("4. 인피니티 건틀렛  |    100   |   3000$");
            System.out.println("          보유 금액 : " + money + "$");
            System.out.println("===================================");

            System.out.print("구매할 상품 번호를 입력하세요 (상점을 나가시려면 9번을 눌러주세요) : ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            if (choice == 9) {
                System.out.println("상점에서 나갑니다.");
                break;
            }

            switch (choice) {
                case 1:
                    Item item1 = new Item("누더기 글러브", 5, 300);
                    equipItem(item1);
                    break;
                case 2:
                    Item item2 = new Item("평범한 글러브", 10, 500);
                    equipItem(item2);
                    break;
                case 3:
                    Item item3 = new Item("시멘트 글러브", 50, 1500);
                    equipItem(item3);
                    break;
                case 4:
                    Item item4 = new Item("인피니티 건틀릿", 100, 3000);
                    equipItem(item4);
                    break;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다. 다시 선택해주세요.");
            }
        }
    }

    public void equipItem(Item item) {
        if (item.getPrice() > player.getMoney()) {
            System.out.println("보유 금액이 부족합니다.");
            return;
        } else if (equippedItem.getAttack() > item.getAttack()) {
            System.out.println("현재 착용한 장비의 공격력이 더 높습니다.");
            return;
        } else if (equippedItem.getName().equals(item.getName())) {
            System.out.println("현재 착용한 장비와 동일한 장비입니다.");
            return;
        }

        if (equippedItem != null) {
            // 현재 장착된 아이템을 해제합니다
            player.setStrength(player.getStrength() - equippedItem.getAttack());
            System.out.println("착용중인 아이템 " + equippedItem.getName() + "(을)를 해제하였습니다.");
        }

        equippedItem = item;
        player.setMoney(player.getMoney() - item.getPrice()); // 새로운 아이템의 가격을 돈에서 차감
        money -= item.getPrice();
        player.setStrength(player.getStrength() + item.getAttack()); // 플레이어 공격력 증가시키는 코드
        player.setEquipment(item); // Player 장비 변경
        System.out.println(item.getName() + "(을)를 장착하였습니다.");
        System.out.println("공격력이 " + item.getAttack() + " 올랐습니다. 현재 공격력은 " + player.getStrength() + "입니다.");
    }
}
