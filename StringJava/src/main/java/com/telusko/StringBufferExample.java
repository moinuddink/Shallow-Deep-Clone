package com.telusko;

public class StringBufferExample {

    public static void main(String[] args) {

        //Direct literals are not allwoed in StringBuffer we have to create with new keyword
        StringBuffer sb = new StringBuffer("Telusko");
        System.out.println(sb);
        StringBuilder bs = new StringBuilder("Telusko");
        System.out.println(bs);

        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity());

        StringBuilder bs1 = new StringBuilder();
       StringBuilder bsnew= bs1.append("Telusko");
        System.out.println(bsnew);
        System.out.println(bs1.capacity());



    }
}
