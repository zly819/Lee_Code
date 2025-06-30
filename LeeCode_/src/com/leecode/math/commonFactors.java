package com.leecode.math;

/**
 * @author 张立业
 * @version 1.0
 * 给你两个正整数 a 和 b ，返回 a 和 b 的 公 因子的数目
 * 输入：a = 12, b = 6
 * 输出：4
 * 解释：12 和 6 的公因子是 1、2、3、6 。
 */
public class commonFactors {
    public static void main(String[] args) {
        System.out.println(new Solution().commonFactors(25,30));
    }
    static class Solution {
        public int commonFactors(int a, int b) {
            int count = 0;
            if (a >= b) {
                for (int i = 1; i <= b; i++) {
                    if (a % i == 0 && b % i == 0) {
                        count++;
                    }
                }
            } else if (b > a) {
                for (int i = 1; i <= a; i++) {
                    if (a % i == 0 && b % i == 0) {
                        count++;
                    }
                }

            }
            return count;
        }
    }
}
