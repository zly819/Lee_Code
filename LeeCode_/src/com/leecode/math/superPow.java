package com.leecode.math;

/**
 * @author 张立业
 * @version 1.0
 * 你的任务是计算 a^b 对 1337 取模，a 是一个正整数，b 是一个非常大的正整数且会以数组形式给出。
 * 输入：a = 2, b = [3]
 * 输出：8
 *
 * 输入：a = 2, b = [1,0]
 * 输出：1024
 */
public class superPow {
    public static void main(String[] args) {
        System.out.println(new Solution().superPow(2, new int[]{1, 2, 3}));
    }

    static class Solution {
        private final int MOD = 1337;

        public int superPow(int a, int[] b) {
            if (b == null || b.length == 0) return 1;
            a %= MOD; // 防止 a 过大
            int res = 1;
            for (int digit : b) {
                res = (pow(res, 10) * pow(a, digit)) % MOD;
            }
            return res;
        }

        // 快速幂计算 base^k % MOD
        private int pow(int base, int k) {
            int result = 1;
            base = base % MOD;
            while (k > 0) {
                if (k % 2 == 1) {
                    result = (result * base) % MOD;
                }
                base = (base * base) % MOD;
                k /= 2;
            }
            return result;
        }
    }
}
