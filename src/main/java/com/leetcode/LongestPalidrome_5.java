package com.leetcode;

import java.util.HashMap;

/**
 * Created by ak on 6/20/17.
 */

/*
    Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

    Example:
        Input: "babad"
        Output: "bab"

    Note: "aba" is also a valid answer.
    Example:
        Input: "cbbd"
        Output: "bb"
 */
public class LongestPalidrome_5 {

    private static int longestPalidrome(String str) {

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = -1;

        for (int i = 0, j = 0; i < str.length(); i++) {

            if (map.containsKey(str.charAt(i)) && checkPalindrome(str , map.get(str.charAt(i)) ,i)) {
                j = map.get(str.charAt(i));
                max = Math.max(max, i - j);
            } else
                map.put(str.charAt(i), i );
        }

        return max + 1;
    }

    private static boolean checkPalindrome(String str, int l, int r){
        while(l < r){

            if((str.charAt(l) ^ str.charAt(r)) != 0)
                return false;
            l++;
            r--;
        }
        return true;
    }

    //Improve the code to handle the dynamic programming
    //https://leetcode.com/problems/longest-palindromic-substring/#/solutions

    // main
    public static void main(String a[]) {
        System.out.println(longestPalidrome("abaaaaabaaab"));
    }
}
