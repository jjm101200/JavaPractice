package org.dimigo.inheritance;

public class IPhone extends SmartPhone{
       public IPhone(String model, String company, int price) {
        super(model, company, price);
    }

    public IPhone() {
    }
    public void pay(){
        System.out.println("에플 페이로 결제합니다.");
    }
    public void useAirDrop(){
        System.out.println("AirDrop 기능을 사용합니다.");
    }
}
