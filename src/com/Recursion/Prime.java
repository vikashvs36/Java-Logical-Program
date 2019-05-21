package com.Recursion;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number to check is prime or not : ");
        long num=scanner.nextLong();
        boolean isPrime=isPrime(num, 2);
        System.out.println(num+" is Prime : "+isPrime);
    }

    // find only prime number
    private static boolean isPrime(long num, int i){
        if (num <= 2) {
            return num%2==0 ? true : false;
        }
        if(num%i == 0) {
            return false;
        }
        if(num < i*i){
            return true;
        }

        return isPrime(num, ++i);
    }
}
