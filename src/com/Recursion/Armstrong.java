package com.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Armstrong {
    public static void main(String[] args) {
//        boolean result=(153==isArmstrong(153, 0)) ? true : false;
        boolean result=(150==isArmstrong(150, 0)) ? true : false;
        System.out.println(result);
        System.out.println(armstrongBtwn(500));
    }

    private static Long isArmstrong(long num, long a){

        long rem = num%10;
        a+=rem*rem*rem;

        if (num == 0) { return a; }

        return isArmstrong(num/10, a);
    }


    private static List<Long> armstrongBtwn(long num){
        List<Long> list=new ArrayList<>();
        for (long i=0; i<num; i++) {
            if (isArmstrong(i, 0) == i) { list.add(i); }
        }

        return list;
    }
}
