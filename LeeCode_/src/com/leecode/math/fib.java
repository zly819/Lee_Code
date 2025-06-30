package com.leecode.math;

/**
 * @author 张立业
 * @version 1.0
 */
public class fib {
    public static void main(String[] args) {
        System.out.println(new Solution().fib(4));
    }
    static class Solution {
        public int fib(int n) {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            }else {
                return fib(n-1) + fib(n - 2);
            }
        }
    }
}
