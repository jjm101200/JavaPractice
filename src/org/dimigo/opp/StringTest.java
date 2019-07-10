package org.dimigo.opp;

public class StringTest {
    public static void main(String[] args) {
        // 문자열 리터럴방식(literal pool)
        String dog1 = "멍멍이";
        String dog2 = "멍멍이";
        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));

        String cat1 = new String("야옹이");
        String cat2 = new String ("야옹이");
        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));

        String id = null;
        if("admin".equals(id))
        {
            System.out.println("관리자");
        }
        else
        {
            System.out.println("관리자 아님.");
        }

        testString();
    }

    private static void testString() {
        // 01234567890123
        String s = "abcdefgABCDEGH";
        System.out.println(s.length());
        System.out.println(s.substring(3));
        System.out.println(s.substring(3,6));
        System.out.println(s.indexOf("C"));
        System.out.println(s.charAt(9));
        System.out.println(s.concat("ABC"));
        System.out.println("       ABC                 ".trim()); // [ABC]  출력 호시이
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.replace('a','A'));   //Abcdef...
        System.out.println(s.startsWith("abc"));
        System.out.println(s.endsWith("FG"));
    }
}
