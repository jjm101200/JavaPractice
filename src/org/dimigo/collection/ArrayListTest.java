package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        //1.List계열
//        List list = new ArrayList();
//        list.add("나지바");
//        list.add(133);
//        list.add(new Dog("멍멍이"));
//        list.get(0); //나자바.
//        list.get(1); // 133
//        String str = (String)list.get(0);
//        제너릭
        List<String> list = new ArrayList<>();
        list.add("사과");
        list.add("배");
        list.add("딸기");
        list.add("딸기");
        list.add(1,"포도");
        printList(list);
        list.set(2,"바나나");
        printList(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));

        list.remove(0);
        printList(list);
        list.remove("딸기");
        printList(list);

        list.clear();
        printList(list);

    }
    private static void printList(List<String> list)
    {
        for(String s : list){
            System.out.printf(s +"|");
        }
    }
}
