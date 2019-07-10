package org.dimigo.interfaces;

public interface IAnimal {

    //상수처리 (public static final 자동붙임
    String Farm_Name = "디미 동물농장";

    //추상메소드 선언
    default void eat()
    {
        System.out.println("냠냠");
    }
    void bark();  //public abstract 자동 붙임.
    //정적메소드
    public static void welcome(){
        System.out.println(Farm_Name+"에 오신걸 환영합니다.");
    }




}
