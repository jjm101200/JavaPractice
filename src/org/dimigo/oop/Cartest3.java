package org.dimigo.oop;

public class Cartest3 {
    public static void main(String[] args) {

        Car3 car1 = new Car3("현대자동차","재네시스","검정색",225,50000000);

        System.out.println("제조사명 :" + car1.getCompany());
        System.out.println("모델명 :" + car1.getModel());
        System.out.println("색상 : " + car1.getcolor());
        System.out.println("최대속도 : " + car1.getMaxSpeed()+"km");
        System.out.printf("가격 :%,d원\n\n",car1.getPrice());

        Car3 car2 = new Car3("기아자동차","K7","흰색",246);
        System.out.println("제조사명 :" + car2.getCompany());
        System.out.println("모델명 :" + car2.getModel());
        System.out.println("색상 : " + car2.getcolor());
        System.out.println("최대속도 : " + car2.getMaxSpeed()+"km");
        System.out.printf("가격 : %,d원\n\n",car2.getPrice());
        Car3 car3 = new Car3("삼성자동차","SM7","회색");

        System.out.println("제조사명 :" + car3.getCompany());
        System.out.println("모델명 :" + car3.getModel());
        System.out.println("색상 : " + car3.getcolor());
        System.out.println("최대속도 : " + car3.getMaxSpeed()+"km");
        System.out.printf("가격 : %,d원\n\n",car3.getPrice());
    }
}
