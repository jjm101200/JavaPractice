package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int[] attackPoint = {100,100,100,100};
        String[] character = {"마법사","영주","기사","농민"};
        int Menu = 0; int num = 5;
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("--------------------");
            System.out.println("1. 캐릭터 설정");
            System.out.println("2. 공격력 증가");
            System.out.println("3. 공격력 감소");
            System.out.println("9. 종료 ");
            System.out.println("--------------------");
            System.out.print("메뉴 입력 => ");
            Menu = scanner.nextInt();
            switch (Menu) {
                case 1:
                        num=new Random().nextInt(3)+1;
                        System.out.printf("%s\n",character[num]);
                        break;
                case 2:
                    if(num == 5)
                    {
                        System.out.printf("캐릭터부터 설정해\n");
                        break;
                    }
                    else {
                    attackPoint[num] += 10;
                    System.out.printf("%s 공격력이 증가되었습니다. 현재 공격력 : %d\n",character[num],attackPoint[num]);
                    break;
                }
                case 3:
                    if (num ==5)
                    {
                        System.out.printf("캐릭부터 설정해");
                        break;
                    }
                    else
                    {
                        attackPoint[num]-=10;
                        System.out.printf("%s 공격력이 감소되었습니다. 현재 공격력 : %d\n",character[num],attackPoint[num]);
                    }
                    break;
                case 9:
                    System.out.printf("이제 공부하세요");
                    break;
                    default:
                        System.out.printf("없는 메뉴에요");
            }
        }while(Menu!=9);
        }
    }




/*        int num=new Random().nextInt(6)+1;









        /*
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++)
                System.out.printf("★ %d x %d = %d\t ", i, j, i * j);
            System.out.printf("\n");
        }
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int value : arr) {
            System.out.println(value);
        }
        String[] BTS = {"슈가", "제이홉", "남준"};
        for (String name : BTS) {
            System.out.println(name);
        }
        Scanner scanner = new Scanner(System.in);
        int Menu=0;
        do {
            System.out.println("1. 캐릭터 설정");
            System.out.println("2. 공격력 증가");
            System.out.println("3. 공격력 감소");
            System.out.println("9.종료");
            System.out.println("메뉴 -> ");
            Menu = scanner.nextInt();
            switch (Menu) {
                case 1:
                    System.out.println("ITZY선택맨");
                    break;
                case 2:
                    System.out.println("Let's burn");
                    break;
                case 3:
                    System.out.println("걸스걸스");
                    break;
                case 4:
                    System.out.println("소녀시대를 선택하셧네ㅇㅛ");
                    break;
                case 9:
                    System.out.println("잘가시게");
                    scanner.close();
                    break;
                default:
                    System.out.println("제대로 입력을 하세요 예?1");
            }
        } while (Menu != 9) ;
    }
}

*/