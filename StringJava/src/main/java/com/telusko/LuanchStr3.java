package com.telusko;

public class LuanchStr3 {

    public static void main(String[] args) {

        String s1 = new String("durga");
        String s2 = s1.toLowerCase();
        String s3 = s1.toUpperCase();

        System.out.println(s1==s2);
        System.out.println(s1==s3);

        String s4 = new String("Moin");


        System.out.println("******************");
        String s5 = "durga";
        String s6 = s5.toString();
        String s7 = s5.toLowerCase();
        String s8 = s5.toUpperCase();
        System.out.println(s5==s6);
        System.out.println(s5==s7);
        System.out.println(s5==s8);

    }
}
