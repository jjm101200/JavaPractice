package org.dimigo.basic;
;
import java.util.Random;

public class Condition {
    public static void main(String[] args) {
        double age = 17;
        if (age >= 19)
            System.out.printf("투표하러 가세요\n");
        else
            System.out.printf("선거권이 없네요\n");
        System.out.println(new Random().nextInt(6)+1);
        int num=new Random().nextInt(6)+1;
        switch (num % 2) {
            case 0:
                System.out.println("홀수");
                break;
            case 1:
                System.out.println("짝수");
                break;
            default:
                System.out.println("누구냐");
                break;
        }
        String menu = "치킨";
        switch (menu){
            case "치킨":
                System.out.println("치킨 선택");
                break;
            case "피자":
                System.out.println("피자 선택");
                break;
                default:
                    System.out.println("다이어트중");

        }
    }
}