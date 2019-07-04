package com.patterns;

import java.util.Scanner;


/*

This pattern will print Floyd's Trangle of number where ever you want to print like given below:

1
2 3
4 5 6
7 8 9 10

* */

public class FloydsTrangle {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int length=scanner.nextInt(),count =0;
        for (int i=0; i<=length;i++) {
            for (int j = 0; j <= i; j++) {
                count++;
                System.out.print(count+" ");
                if (count == length) { break; }
            }
            if (count == length) { break; }
            System.out.println("");
        }
    }
}
