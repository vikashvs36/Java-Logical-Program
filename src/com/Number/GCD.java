package com.Number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GCD {

    public static void main(String[] args) {
//        int num1 = 55, num2 = 121;
        int num1 = 30, num2 = 250;
        System.out.printf("GCD of %d and %d is : %d", num1, num2, gcd(num1, num2, 1));

    }

    private static long gcd(long num1, long num2, long gcd) {

//        long gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;
        }

        return gcd;
    }
}