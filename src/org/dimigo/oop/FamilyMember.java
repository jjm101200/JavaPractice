package org.dimigo.oop;

public class FamilyMember {
    private static int cnt;
    private String membername;


    public FamilyMember(String membername) {
        this.membername = membername;
        cnt++;
    }

    public String getMembername() {
        return membername;
    }
    public static void printMemberCnt() {
        System.out.println(cnt);
    }

    }

