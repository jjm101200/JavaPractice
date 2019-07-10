package org.dimigo.oop;

public class IdolGroup {
    public static void main(String[] args) {
        String[] GroupName = {"방탄", "2NE1","걸스데이"};
        String[][] membername = {{"정국", "지민", "뷔", "슈가", "진"},
                {"CL", "산다라박", "박봄", "민지"},
                {"유라", "혜리", "소진", "민아"}
        };
        for (int i=0;i<=GroupName.length-1;i++)
        {
            System.out.printf("<< %s >>\n",GroupName[i]);
            for(String a : membername[i]) {
                System.out.println(a);
            }
            System.out.println();
        }
    }
}

