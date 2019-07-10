package org.dimigo.abstractclass;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setIEngine(new BenzIEngine());
        car.start();
        car.stop();
        System.out.println("=== 엔진 교체 ===");
        car.setIEngine(new BMWIEngine());
        car.start();
        car.stop();


    }

}
