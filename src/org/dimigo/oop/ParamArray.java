package org.dimigo.oop;

public class ParamArray {
    public static void main(String[] args) {
        int[] intArr = { 1,2,3,4,5};
        add(intArr,10);   // 11,12,13,14,15
        printArray(intArr);
        String[] names = {"홍길동","홍길서","홍길남","홍길북"};
        changeName(names);
        printArray(names); //김길동,김길서,김길남,김길북.
    }

    private static void changeName(String[] names) {
        for (int i=0; i<names.length;i++)
            names[i] = "김"+names[i].substring(1);
    }

    private static void printArray(String[] names)
    {
        for(String value : names)
        {
            System.out.println(value+"ㅣ");
        }
        System.out.println();
    }

    private static void printArray(int[] intArr) {
     for(int a : intArr)
     {
         System.out.print(a+"ㅣ");
     }
        System.out.println();
    }

    private static void add(int[] intArr, int num) {
        for(int j = 0 ;j< intArr.length;j++)
        {
            intArr[j]+=num;
        }
    }
}
