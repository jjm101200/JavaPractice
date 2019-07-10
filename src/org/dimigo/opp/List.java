package org.dimigo.opp;

public class List {

    public List() {
    }
    private int price;
    private String name;
    private int num;
    private int  disprice;
    private int  date;

    public void delete() {
        System.out.println("삭제했습니다");
    }
    public void order() {
        System.out.println("주문했습니다.");
    }

    public void continue1() {
        System.out.println("계속 쇼핑합니다.");
    }

    public void change(int type) {
        System.out.println(type +"개로 변경합니다.");
    }
    public boolean check() {
        System.out.println("선택되었습니다.");
        return true;
    }

}