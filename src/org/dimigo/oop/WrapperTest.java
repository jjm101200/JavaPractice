package org.dimigo.oop;

public class WrapperTest
{
    public static void main(String[] args) {
        //Wrapper 클래스 : Primitive Type을 객체화시켜주는 클래스
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.toBinaryString(10));  //2진수
        System.out.println(Integer.toOctalString(10));  //8진수로 만들어줌
        System.out.println(Integer.toHexString(10));    //16진수로 만들어줌

        //Boxing
        // 1) 생성자
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");
        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));

        // 2) valueof()
        Integer i3 = Integer.valueOf(100);
        Double d1 = Double.valueOf(3.14);

        // Unboxing
        int r1 = i3.intValue();
        double r2 = d1.doubleValue();

        // 문자열 -> Primitive Data Type - parseXxx()
        int p1 = Integer.parseInt("200");
        double p2 = Double.parseDouble("3.14");

        System.out.println(args[0]);   //"100"
        System.out.println(args[1]);   //"200"
        // 100+200 = 300

        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        System.out.printf("%d + %d = %d \n",n1,n2,n1+n2);

        Integer a = new Integer(1000);
        Integer b = new Integer(2000);
        System.out.println(a + b);

        Integer c = 1000;
        int d = c+1000;
        Integer obj1 = 10;
        Integer obj2 = obj1 + 20;
        Integer result = obj1+obj2;
        //boxing 3번 unboxing 3번



    }


}
