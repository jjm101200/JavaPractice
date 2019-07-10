package org.dimigo.oop;

public class Person {
    private final String type  = "포유류";
    public static final String TYPE= "포유류";
    private final String birthDate;
    private String name;

    public Person(String birthDate, String name) {
        this.birthDate = birthDate;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "type='" + TYPE + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("20021012","조민수");
        Person p2 = new Person("20021208","박태훈");
        System.out.println(Person.TYPE);

    }

}
