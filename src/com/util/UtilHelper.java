package com.util;

public class UtilHelper {

    private static final int DIFF=32;

    public static void main(String[] args) {
        String name="VikAsh";
        System.out.println("ToLowercase : "+toLowercase(name));
        System.out.println("ToUppercase : "+toUppercase(name));
        System.out.println("ToToggleCase : "+toToggle(name));
    }

    public static String toLowercase(String str){

        String lowercase="";

        char[] arr=str.toCharArray();
        for (int i=0;i<arr.length;i++) {
            lowercase +=(char) (arr[i] | DIFF);
        }

        return lowercase;
    }

    public static String toUppercase(String str){

        String uppercase="";

        char[] arr=str.toCharArray();
        for (int i=0;i<arr.length;i++) {
            uppercase +=(char) (arr[i] & ~DIFF);
        }

        return uppercase;
    }

    public static String toToggle(String str){

        String toggleCase="";

        char[] arr=str.toCharArray();
        for (int i=0;i<arr.length;i++) {
            toggleCase +=(char) (arr[i] ^ DIFF);
        }

        return toggleCase;
    }

}
