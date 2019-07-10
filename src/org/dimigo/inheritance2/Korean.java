package org.dimigo.inheritance2;

public class Korean extends Person{
    public Korean(String name) {
        super("홍길동");
    }

    @Override
    public void sayHello() {
        System.out.println("안녕하세요");
    }

    @Override
    public void sayBye() {
        System.out.println("안녕히 계세요");
    }

    @Override
    public String toString() {
        return "저는 한국사람 " + getName() + "입니다.";
    }
}
