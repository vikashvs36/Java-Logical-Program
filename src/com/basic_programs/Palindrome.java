package com.basic_programs;

import com.util.UtilHelper;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number to check palindrome : ");
        String str=scanner.next();
        String result=checkPalindrome(str) ? "Yes" : "No";
        System.out.println("Is "+str+" palindrome : "+result);

    }

    public static boolean isPalindrome(long num) {
        long temp=num, reverse=0;

        while(num > 0){
            long rem=num%10;
            num = num/10;
            reverse = (reverse*10)+rem;
        }

        return temp == reverse;
    }

    public static boolean isPalindrome(String str) {
        str = UtilHelper.toLowercase(str);
        char arr[]=str.toCharArray();
        String reverse="";

        for (int i=0; i<arr.length; i++) { reverse = arr[i]+reverse; }
//        for (int i=arr.length-1; i>=0; i--) { reverse += arr[i]; }

        return str.equals(reverse);
    }

    private static boolean checkPalindrome(String str){
        boolean flag=true;
        long num=0;

        try {
            num=Long.parseLong(str);
        }catch (NumberFormatException ex) { flag = false; }

        return flag == true ? isPalindrome(num) : isPalindrome(str);
    }
}
