package com.company;

/*
Largest palindrome product
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Problem4 {

    public static int getLength(int number){
        int length = 0;

        while (number > 0){

            number = number / 10;
            length++;

        }

        return length;
    }

    public static int flipNumber(int number, int length){
        int temp = 0;
        int multi = 1;
        int div = 1;
        int flip = number;
        
        for(int i = 1; i <= length - 1; ++i){
            div = div * 10;
        }

        for (int i = 1; i <= length; ++i) {
            temp = (((flip / div) * multi) + temp);
            flip = flip - ((flip / div) * div);
            multi = multi * 10;
            div = div / 10;
        }


        return temp;
    }

    public static void getPalindrome(int start, int end){
        int test = 0;
        int highest = 0;
        for (int index = 1; index <= end; ++index){

            for (int i = 1; i <= end; ++i){
            test = index * i;
            if (test == flipNumber(test, getLength(test))){
                if (test > highest){
                    highest = test;
                }
            }
            }
        }
        System.out.println(highest);
    }

}
