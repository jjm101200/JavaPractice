package org.dimigo.oop;

public class Cartest {
    public static void main(String[] args) {
        Car car1 = new Car();

        System.out.println("제조사명 :" + car1.getCompany());
        System.out.println("모델명 :" + car1.getModel());
        System.out.println("색상 : " + car1.getcolor());
        System.out.println("최대속도 : " + car1.getMaxSpeed()+"km");
        System.out.printf("가격 :%,d원\n\n",car1.getPrice());

        Car car2 = new Car();
        car2.setCompany("기아자동차");
        car2.setModel("K7");
        car2.setColor("흰색");
        car2.setMaxSpeed(246);
        car2.setPrice(40000000);

        System.out.println("제조사명 :" + car2.getCompany());
        System.out.println("모델명 :" + car2.getModel());
        System.out.println("색상 : " + car2.getcolor());
        System.out.println("최대속도 : " + car2.getMaxSpeed()+"km");
        System.out.printf("가격 :%,d원\n\n",car2.getPrice());

        Car car3 = new Car();
        car3.setCompany("삼성자동차");
        car3.setModel("SM7");
        car3.setColor("회색");
        car3.setMaxSpeed(200);
        car3.setPrice(38000000);

        System.out.println("제조사명 :" + car3.getCompany());
        System.out.println("모델명 :" + car3.getModel());
        System.out.println("색상 : " + car3.getcolor());
        System.out.println("최대속도 : " + car3.getMaxSpeed()+"km");
        System.out.printf("가격 : %,d원\n\n",car3.getPrice());
    }
}
