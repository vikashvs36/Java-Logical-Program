package com.Recursion;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial : ");
        int num=scanner.nextInt();
        long fact=factorial(num);
        System.out.println("Factorial : "+fact);
    }

    private static long factorial(int fact){
        if(fact == 0 ) { return 1; }
        return fact*factorial(fact-1);
    }
}
