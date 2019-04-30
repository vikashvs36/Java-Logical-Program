package com.basic_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number to check Event or Odd : ");
        long num=scanner.nextLong();
        String result=checkEvenOrOdd(num) ? "Even" : "Odd";
        System.out.println(num+" is "+result);

        System.out.println("evenList : "+evenList(0, 50));
        System.out.println("oddList : "+oddList(0, 50));

        // Even or Odd Number Using Java 8
        List<Integer> numbers= Arrays.asList(4,5,6,7,8,9,11,21,25,26,28,30,36,38,39, 40);

        // Get All Even Numbers using Java 8
        System.out.print("Even List : ");
        numbers.stream().filter(n->n%2 == 0).forEach(it->System.out.print(it+" "));

        // Get All Odd Numbers using Java 8
        System.out.print("\nOdd List : ");
        numbers.stream().filter(n->n%2 != 0).forEach(it->System.out.print(it+" "));


    }

    public static boolean checkEvenOrOdd(long num){

        if (num%2 == 0) { return true; }

        return false;
    }

    public static List<Long> evenList(int from, int to){
        List<Long> evenList=new ArrayList<>();

        if (from < 1) { from = 1; }

        for (long i=from; i<=to; i++)
            if (checkEvenOrOdd(i))
                evenList.add(i);

        return evenList;
    }

    public static List<Long> oddList(int from, int to){
        List<Long> evenList=new ArrayList<>();

        if (from < 1) { from = 1; }

        for (long i=from; i<=to; i++)
            if (!checkEvenOrOdd(i))
                evenList.add(i);

        return evenList;
    }
}
