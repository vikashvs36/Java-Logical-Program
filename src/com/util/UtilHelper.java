package com.util;

public class UtilHelper {

    private static final int DIFF=32;

    public static void main(String[] args) {
        System.out.println(toLowercase("VikAsh"));
    }

    public static String toLowercase(String str){

        String lowercase="";

        char[] arr=str.toCharArray();
        for (int i=0;i<arr.length;i++) {
            lowercase +=(char) (arr[i] | DIFF);
        }

        return lowercase;
    }

}
