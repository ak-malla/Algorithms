package com.practice;

/**
 * Created by ak on 6/20/17.
 */
public class Median_4 {
    /**
     * Find the median for 2 sorted arrays
     */

    private static double median(int A[], int B[]){
        // Make sure the small arrays is always the first

        if(A.length > B.length)
            return median(B , A);

        int a = A.length;
        int b = B.length;
        int k = (a + b - 1) / 2; // Median of the whole 2 arrays as single
        int l = 0;
        int r = Math.min(a , k);

        while(l < r){

            int midA = (r + l) / 2;
            int midB = k - midA;

            if(A[midA] < B[midB])
                l = midA + 1;
            else
                r = midA;
        }

        // Once the position of l is decided the median is between l-1, l, k-l, k-l-1
        int aa = Math.max( l > 0 ? A[l -1] : Integer.MIN_VALUE, k -l >= 0 ? B[k -l] : Integer.MIN_VALUE );
        if(((a+b) & 1) == 1)
            return aa;

        int bb = Math.min(l < k ? A[l] : Integer.MAX_VALUE, k - l + 1 < b ? B[k - l + 1] : Integer.MAX_VALUE);
            return (aa + bb) / 2.0;

    }

    // Main
    public static void main(String a[]){
        int[] aa = {1, 2, 3};
        int[] b = {4, 5};
        System.out.println(median(aa, b));

    }
}
