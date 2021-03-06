package com.company;

/*
Smallest multiple
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */


public class Problem5 {


    public static int getFactors(int end){
        int temp = 2;
        while (true){
            for (int i = 2; i <= end; ++i) {
                if (temp % i != 0){
                    break;
                }
                if (i == end){
                    return temp;
                }
            }
            temp++;
        }

    }
}
