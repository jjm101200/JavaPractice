package org.dimigo.oop;

public class Cartest2 {
    public static void main(String[] args) {
        Car car1 = new Car();

        System.out.println("제조사명 :" + car1.getCompany());
        System.out.println("모델명 :" + car1.getModel());
        System.out.println("색상 : " + car1.getcolor());
        System.out.println("최대속도 : " + car1.getMaxSpeed()+"km");
        System.out.printf("가격 :%,d원\n\n",car1.getPrice());

        Car2 car2 = new Car2("기아자동차","K7","흰색",246,40000000);
        System.out.println("제조사명 :" + car2.getCompany());
        System.out.println("모델명 :" + car2.getModel());
        System.out.println("색상 : " + car2.getcolor());
        System.out.println("최대속도 : " + car2.getMaxSpeed()+"km");
        System.out.printf("가격 : %,d원\n\n",car2.getPrice());
        Car2 car3 = new Car2("삼성자동차","SM7","회색",200,38000000);

        System.out.println("제조사명 :" + car3.getCompany());
        System.out.println("모델명 :" + car3.getModel());
        System.out.println("색상 : " + car3.getcolor());
        System.out.println("최대속도 : " + car3.getMaxSpeed()+"km");
        System.out.printf("가격 : %,d원\n\n",car3.getPrice());
    }
}
