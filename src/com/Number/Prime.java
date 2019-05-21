package com.Number;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Prime {

    public static void main(String[] args) {
        System.out.println("Prime number : " +isPrime(7));
        System.out.println("Prime number between m to n: " +primeBetween(0, 50));
        System.out.println("N Prime number : " +allPrime(50));
    }

    private static boolean isPrime(long num){
        boolean flag=true;

        for (int i=2; i<=num/2; i++){
            if(num%i == 0){
                flag=false;
            }
        }

        return flag;
    }

    // find all positive prime numbers between 1 to n or m to n
    private static List<Number> primeBetween(int startNumber, int lastnumber){
        List<Number> number=new ArrayList<>();

        startNumber = (startNumber>2) ? startNumber : 2;
        for (int i=startNumber; i<=lastnumber; i++){
            if(isPrime(i)) number.add(i);
        }

        return number;
    }

    // find n positive prime numbers
    private static List<Number> allPrime(int count){
        List<Number> number=new ArrayList<>();

        int num=2;
        while (true) {
            if (number.size() == count){
                return number;
            }

            if(isPrime(num)) number.add(num);
            num++;
        }
    }
}
