package org.dimigo.inheritance;

public class AnimalTest {

    public static void main(String[] args) {

        Animal[] animals = {
                new Animal("동물"),
                new Dog("멍멍이"),
                new Cat("냐옹이"),
                new Tiger("호돌이")
        };
        for(Animal a : animals){
            System.out.println(a);  //Animal.eat()
            a.sleep();              //Animal.sleep()
            a.bark();               //Cat.bark
             }
//        doAction(Animal(a));

        Animal dog = new Dog("댕댕이");
        dog.eat();
        dog.sleep();
        ((Dog) dog).wag();
        Dog dog2 = (Dog)dog;
        dog2.wag();
        ((Dog)dog).wag();
        Animal cat= new Cat("냐옹이");
        ((Cat) cat).scratch();
        Cat cat2= (Cat)cat;
        cat2.scratch();
        System.out.println(dog instanceof Dog);
        System.out.println(cat instanceof Object);

    }

    private static void doAction(Animal a){
//        System.out.println(a);  //Animal.eat()
//        a.sleep();              //Animal.sleep()
//        a.bark();               //Cat.bark

    }

}
