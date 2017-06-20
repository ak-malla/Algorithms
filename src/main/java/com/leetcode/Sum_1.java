package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by AK on 11/06/17.
 */
public class Sum_1 {
    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * <p>
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * <p>
     * Example:
     * Given nums = [2, 7, 11, 15], target = 9,
     * <p>
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     */

    private static int[] sum(int[] arr, int target) {

        Map<Integer, Integer> m = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {

            if (m.containsKey(target - arr[i])) {

                return new int[]{m.get(target - arr[i]), i};

            } else {
                m.put(arr[i], i);
            }
        }

        return new int[]{0, 0};
    }

    public static void main(String a[]) {
        int[] arr = {0, 1, 7, 8};

        System.out.println(Arrays.toString(sum(arr, 9)));

    }
}
