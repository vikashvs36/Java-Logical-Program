package com.patterns;


import java.util.Scanner;

/*

This pattern will be drow a square or rectangle which is given below. You can write A as well using this format.

        * * *           * * * * *       *
        *   *           *       *       * *
        * * *           * * * * *       *   *
                                        *     *
                                        * * * * *

        Square          Rectangle       Triangle

*/
public class Square {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int length=scanner.nextInt();

        square(length);

        rectangle(length, length+2);

        triangle(length);

    }


    public static void square(int length) {
        for (int i=0; i<length; i++) {
            for(int j=0; j<length;j++) {
                if(i==0 || i==length-1) {
                    System.out.print("* ");
                } else {
                    if (j==0 || j==length-1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void rectangle(int length, int width) {
        for (int i=0; i<length; i++) {
            for(int j=0; j<width; j++) {
                if(i==0 || i==length-1) {
                    System.out.print("* ");
                } else {
                    if (j==0 || j==width-1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void triangle(int length) {
        for (int i=0; i<length; i++) {
            for (int j=0; j<length; j++) {
                if(j==0 || i== length-1) { System.out.print("* "); }

                else if (i == j){ System.out.print("* "); }

                else { System.out.print("  "); }
            }
            System.out.println();
        }
    }
}
