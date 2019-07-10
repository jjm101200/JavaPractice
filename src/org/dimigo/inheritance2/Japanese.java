package org.dimigo.inheritance2;

public class Japanese extends Person{

    public Japanese(String name) {
    super("다나카");
    }

    @Override
    public void sayHello() {
        System.out.println("오하이요");
    }

    @Override
    public void sayBye() {
        System.out.println("사요나라");;
    }

    @Override
    public String toString() {
        return "저는 일본사람 "+ getName() + "입니다.";
    }
}
