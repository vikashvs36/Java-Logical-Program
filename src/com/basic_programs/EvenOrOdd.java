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
