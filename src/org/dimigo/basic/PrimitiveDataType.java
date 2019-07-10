package org.dimigo.basic;
public class PrimitiveDataType {
    public static void main(String[] args) {
        System.out.printf("<< 아이유 프로필 >>\n");
        String name = "이름 :아이유";
        System.out.println(name);
        boolean isMale = false;
        if (isMale == false)
            System.out.printf("성별 :여자\n");
        else if(isMale == true)
            System.out.printf("성별 : 남자\n");
        int age = 25;
        System.out.printf("나이 : %d세\n",age);
        double height = 161.8D;
        System.out.printf("키 : %.2fcm\n",height);
        float weight = 44.3f;
        System.out.printf("몸무게 : %.1fkg\n",weight);
        char bloodType = 'A';
        System.out.printf("혈액형 : %c형\n",bloodType);
        String titleSong = "대표곡 : 삐삐";
        System.out.println(titleSong);
    }
}