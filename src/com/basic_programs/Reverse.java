package com.basic_programs;

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
        int num=0;
        boolean flag=true;
        try {
            num=Integer.parseInt(str);
        }catch (NumberFormatException ex){
            flag = false;
        }
        return flag == true ? reverseInt(num).toString() : reverseString(str) ;
    }

    private static Number reverseInt(int num) {

        String reverse="";
        while (num > 0){
            int rem=num%10;
            num /= 10;
            reverse += rem;
        }

        return Integer.parseInt(reverse);
    }

    private static String reverseString(String str){
        String rev="";
        char arr[]=str.toCharArray();
        for (int i=str.length()-1; i>=0; i--){
            rev +=arr[i];
        }
        return rev;
    }
}
