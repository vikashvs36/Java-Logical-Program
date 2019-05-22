package com.Number;

public class SquareRoot {

    public static void main(String[] args) {

//        System.out.println("Squareroot : "+squareRoot(49));
//        System.out.println("Squareroot : "+squareRoot(80));
//        System.out.println("Squareroot : "+squareRoot(144));
        System.out.println("Squareroot : "+squareRoot(15));
    }

    private static double squareRoot(double num){

        if (num<0) return -1;
        if (num ==1 || num==0) return num;

        double start=1,end=num, precision=0.00001;
        long square=0;

        if(num < 1) end=1;

        while (end-start>precision ) {
            double mid=(start+end)/2;
            double midsquare=mid*mid;
            if(midsquare == num) return mid;
            else if (midsquare < num) start=mid;
            else end=mid;
        }

        // That is not possible to find out exact square root but using this example we can achieve approx square root.
        return (start+end)/2;
    }


}
