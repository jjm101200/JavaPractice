package org.dimigo.inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("아이유 ",25,160,45);
        System.out.println(p);
        p.eat();
        p.sleep();
        Student s = new Student("조민수",18,178,74,"172430");
        System.out.println(s);
        s.study();
        s.eat();

        Teacher t = new Teacher("지은혜",28,165,50,"네트워크");
        System.out.println(t);
        t.eat();
        t.doTast();
        t.teach();
        t.sleep();

    }
}