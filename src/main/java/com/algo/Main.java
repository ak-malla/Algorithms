package com.algo;

import java.util.Arrays;

/**
 * Created by AK on 29/05/17.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome AK, Hello World !");

    }

    /**
     * Created by AK on 31/05/17.
     */
    public static class ArrayPartitionI {

        /**
         * Find the best pairs whose min element sum should be the greatest
         * <p>
         * Solution:
         * 1. Sort the given array
         * 2. Sum of oddth element i.e., 1st + 3rd + 5th ... is the result.
         */

        public static void main(String a[]) {

            //Input Array ...
            int aa[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println("Given Array : " + Arrays.toString(aa));
            System.out.println("Sum of the min of Pairs is : " + getSumOfMinOfPairs(aa));
        }

        private static int getSumOfMinOfPairs(int a[]) {

            Arrays.sort(a);
            System.out.println("Sorted Array : " + Arrays.toString(a));
            int sumResult = 0;
            for (int i = 0; i < a.length; i += 2) {
                sumResult += a[i];
            }

            return sumResult;
        }

    }

    /**
     * Created by AK on 29/05/17.
     */

    public static class HammingDistance {
        /**
         * Hamming Distance is the relative position of bits which differ, between 2 numbers
         */

        public static void main(String[] a) {

            System.out.println("Hamming distance between 1 & 4 is : " + hammingDistance(1, 5));

        }

        private static int hammingDistance(int x, int y) {

            int xor = x ^ y;
            int count = 0;
            for (int i = 0; i < 32; i++) {
                count += (xor >> i) & 1;
            }
            return count;
        }

    }

    /**
     * Created by AK on 31/05/17.
     */
    public static class NumberComplment {
        /**
         * Given a number n, get the complement of the number
         * <p>
         * i.e., 5 is 0101 complement of 5 is 2 which is 0010
         */

        public static void main(String a[]) {

            System.out.println(~-2);

        }

        private static int numberComplement(int n) {
            return 1;
        }
    }

    /**
     * Created by AK on 11/06/17.
     */
    public static class SumBitOperations {
        /**
         * write to program to result the sum of two given numbers with out using the inbuilt functions.
         * use bit operation to achieve the task
         */

        public static void main(String a[]) {
            /*
                Got to achieve the task using XOR ^ and AND &
                Similar bits will result in 0 for XOR ^

             */
            int x = 5, y = 5;

            while (y != 0) {

                int carry = x & y;

                x = x ^ y;

                y = carry << 1;
            }

            System.out.println("Binary Sum of Digits 5 & 5 is :" + x);
        }
    }
}
