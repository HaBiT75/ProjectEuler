package com.company;

/*
Largest prime factor
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */

import java.util.ArrayList;

public class Problem3 {


    public static void getPrimeFactor(long target){

        ArrayList<Integer> primes = new ArrayList<Integer>();
        long i = 2l;
        while (i < target ){
            //System.out.println(i);


            if (target % i == 0){
                for (long index = 2l; index <= i; ++index){
                    if (i % index == 0){
                        break;
                    }
                    if (index * 2 >= i){
                        primes.add((int) i);
                        System.out.println(i);
                        break;
                    }
                }
            }

            if (i * 2 >= target){
                break;
            }
            i++;
        }

        for (int y = 0; y < primes.size(); ++y){
            System.out.println(primes.get(y));
        }
    }


}
