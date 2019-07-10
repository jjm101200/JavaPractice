package org.dimigo.inheritance2;

public class PersonTest2 {

    private static void greeting(Person p){
        p.getName();
        p.sayHello();
        p.sayBye();
    }
    public static void main(String[] args) {
                Person[] people = new Person[]{
                new Person("Tom"),
                new Korean("홍길동"),
                new Japanese("다나까"),
                new Chinese("왕밍")
        };
    }

}
