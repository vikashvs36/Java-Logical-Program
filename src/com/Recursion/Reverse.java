package com.Recursion;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number to print Reverse : ");
        String str=scanner.next();
        String reverse=reverse(str);
        System.out.println("Reverse : "+reverse);
    }

    private static String reverse(String str) {

        boolean flag=true;
        long num=0;

        try {
            num=Long.parseLong(str);
        }catch (NumberFormatException nfe) { flag =false; }

        return flag == true ? reverseInt(num) : reverseString(str);
    }


    private static String reverseInt(long num) {
        if (num==0) return "";
        return (num%10)+reverseInt(num/10);
    }

    private static String reverseString(String str) {
        if (str == null || str.length()==0) return "";
        return str.toCharArray()[str.length()-1]+reverseString(str.substring(0, str.length()-1));
    }
}
