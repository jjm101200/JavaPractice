package org.dimigo.basic;
public class Operator {
    public static void main(String[] args) {
        long pay = 1700000L;
        long man = 3L;
        long store = 1500L;
        System.out.printf("<<디미벅스 연간 인건비>>\n");
        System.out.printf("월 평균 급여 : %,d원\n",pay);
        System.out.printf("점포 내 직원 수 : %d명\n",man);
        System.out.printf("점포 수 : %,d\n\n",store);
        System.out.printf("연간 인건비 : %,d",pay*12*man*store);
    }
}