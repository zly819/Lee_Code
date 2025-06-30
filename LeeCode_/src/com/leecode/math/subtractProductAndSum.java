package com.leecode.math;

/**
 * @author 张立业
 * @version 1.0
 * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 */
public class subtractProductAndSum {
    public static void main(String[] args) {
        System.out.println(new Solution().subtractProductAndSum(234));
    }
    static class Solution {
        public int subtractProductAndSum(int n) {
            int mul = 1;
            int sum = 0;
            while (n > 0) {
                int num = n % 10;
                mul = mul * num;
                sum = sum + num;
                n /= 10;
            }
            return mul - sum;
        }
    }
}
