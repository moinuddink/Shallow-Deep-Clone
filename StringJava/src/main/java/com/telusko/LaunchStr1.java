package com.telusko;

public class LaunchStr1 {
    public static void main(String[] args) {

        String str1 = "Telusko";
        String str2 = "Telusko";

        String str3 = new String("Telusko");
        String str4 = new String("Telusko");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str3 == str4);
    }
}
