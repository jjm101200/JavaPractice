package org.dimigo.oop;

import java.util.Random;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        int Menu = 0;
        int num = 5;
        String[] answers = {"아이린", "신예은", "자료구조"};
        String[] questions = {"가장 좋아하는 가수는?",
                "가장 좋아하는 배우는?",
                "가장 좋아하는 과목은?"
        };
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("--------------");
            System.out.println("1.질문 선택");
            System.out.println("2.정답 공개");
            System.out.println("9.프로그램 종료");
            System.out.println("--------------");
            System.out.print("메뉴 선택=> ");
            Menu = scanner.nextInt();
            switch (Menu) {
                case 1:
                    num = new Random().nextInt(3);
                    System.out.printf("%s ", questions[num]);
                    String answer = scanner.next();
                    if (answer.equals(answers[num])) {
                        System.out.println("정답입니다!\n");
                    } else {
                        System.out.println("틀렸습니다.\n");
                    }
                    break;
                case 2:
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0 ; i<3;i++) {
                        sb.append(questions[i]).append(" ").append(answers[i]).append("입니다.\n");
                    }
                    System.out.println(sb);
                    break;
                case 9:
                    System.out.println("Bye~");
                    break;
                    default:
                        System.out.println("잘못 입력했어요3");


            }

        }while(Menu!=9);
    }
}