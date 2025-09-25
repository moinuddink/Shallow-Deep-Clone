package com.telusko;

public class LaunchStr2 {

    public static void main(String[] args) {

        String str = "Mohammad Ibrahim Khan";

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.concat("Sohail"));
        System.out.println(str.charAt(1));
        System.out.println(str.trim());
        System.out.println(str.startsWith("M"));
        System.out.println(str.endsWith("S"));
        System.out.println(str.lastIndexOf("S"));
        System.out.println(str.getBytes());
        System.out.println(str.substring(4));
        System.out.println(str.substring(0, 4));
       char[] c= str.toCharArray();
       for(char cc: c){
           System.out.println(cc);
       }
        System.out.println(str.indexOf('m'));

    }
}
