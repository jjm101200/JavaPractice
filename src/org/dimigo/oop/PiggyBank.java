package org.dimigo.oop;

public class PiggyBank {
    public static int balance;

    public static void putMoney(FamilyMember member,int amount)
    {
        balance = balance+amount;
        System.out.printf("%s : %,d원 넣음\n",member.getMembername(),amount);
    }
    public static void printBalance()
    {
        System.out.printf("돼지저금통 총 금액 : %,d원\n",balance);
    }
}
