package org.dimigo.oop;

public class Calculator {
    // 인스턴스 필드 (스태틱이 안붙어있는거 객체필요)
    private int num1;
    private int num2;
    //생성자
    public Calculator(int a, int b){
        this.num1 = a;
        this.num2 = b;
    }
    //메소드
    public void powerOn(){
        System.out.println("전원을 켭니다");
    }
    public void powerOff(){
        System.out.println("전원을 끕니다.");
    }
    public int add(){

        return num1+num2;
    }
    public int sub(){
        return this.num1-this.num2;
    }
    public int mul(){
        return this.num1*this.num2;
    }
    public double div() {
        return (double) this.num1 / this.num2;
    }


    public static void main(String[] args) {
        int a = 10, b = 20;
        Calculator c = new Calculator(a,b);

        c.powerOn();
        System.out.printf("%d + %d = %d \n", a, b, c.add());
        System.out.printf("%d - %d = %d \n", a, b, c.sub());
        System.out.printf("%d * %d = %d \n", a, b, c.mul());
        System.out.printf("%d / %d = %.1f \n", a, b, c.div());
        c.powerOff();
    }
}

