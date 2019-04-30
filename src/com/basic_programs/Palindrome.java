package com.basic_programs;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number to check palindrome : ");
        long num=scanner.nextLong();
        String result=isPalindrome(num) ? "Yes" : "No";
        System.out.println(num+" is "+result);

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
}
