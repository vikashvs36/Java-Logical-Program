package com.Recursion;

public class Set_1 {

    public static void main(String[] args) {
        System.out.println("Question_1 : "+question_1(3,5));
        System.out.println("Question_1 : "+question_2(3,5));
    }

    public static int question_1(int x, int y){
        if (x==0) return y;
        return question_1(x-1,x+y);
    }

    public static int question_2(int x, int y){
        if (x==0) return y;
        return question_2(x-1,x+y)+x;
    }
}
