package com.algo;

/**
 * Created by AK on 20/06/17.
 */
public class BinarySearch {
    /*
        Using recursion
     */
    private static int bRecursion(int arr[], int target, int l, int r) {

        if(l > r)
            return -1;

        int m = l + ((r -l)/ 2);

        System.out.println(" l:"+l+" r:"+r+" m:"+m);

        if (arr[m] == target)
            return m;
        else if (arr[m] > target){
            r = m - 1;
            return bRecursion(arr, target, l, r);
        }else{
            l = m + 1;
            return bRecursion(arr, target, l, r);
        }
    }

    //main
    public static void main(String a[]){
       int arr[] = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(bRecursion(arr , 14, 0, arr.length - 1));

        System.out.println(bWRecursion(arr, 14));
    }

    /*
        Without using recursion
     */
    private static int bWRecursion(int arr[], int target){

        int l = 0;
        int r = arr.length - 1;
        int m = 0;

        while(l <= r){

            m = l + ((r -l) / 2);

            System.out.println(" l:"+l+" r:"+r+" m:"+m);

            if(arr[m] == target)
                return m;
            else if (arr[m] > target)
                r = m - 1;
            else
                l = m + 1;

        }

        return -1;

    }
}
