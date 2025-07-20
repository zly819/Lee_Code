package com.leecode.math;

/**
 * @author 张立业
 * @version 1.0
 * 2 的幂次方的二进制表示中只有一个 1，其余位都是 0
 * 2^0 = 1 (二进制 1)
 *
 * 2^1 = 2 (二进制 10)
 *
 * 2^2 = 4 (二进制 100)
 *
 * 2^3 = 8 (二进制 1000)
 */
public class isPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfTwo(16));
    }

    static class Solution {
        public boolean isPowerOfTwo(int n) {
            if ( n <= 0){
                return false;
            }
            return (n & (n - 1)) == 0;
        }
    }
}
