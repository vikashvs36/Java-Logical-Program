package com.Number;

import java.util.ArrayList;
import java.util.List;

public class Armstrong {

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(armstrongBtwn(500));
    }

    private static boolean isArmstrong(long num){
        long armStrong=0, temp=num;
        while (num > 0) {
            long rem=num%10;
            armStrong +=rem*rem*rem;
            num=num/10;
        }
        return temp == armStrong;
    }

    private static List<Long> armstrongBtwn(long num){
        List<Long> list=new ArrayList<>();
        for (long i=0; i<num; i++){
            if (isArmstrong(i)) list.add(i);
        }
        return list;
    }
}
