package com.leecode.math;

/**
 * @author 张立业
 * @version 1.0
 * 4 的幂次方的二进制表示中，1 只出现在奇数位（从最低位开始算，最低位是第 0 位）
 */
public class isPowerOfFour {
    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfFour(16));
    }


    static class Solution {
        public boolean isPowerOfFour(int n) {
            if (n <= 0) return false;
            // 判断是否是 2 的幂次方
            if ((n & (n - 1)) != 0){
                return false;
            }
            //判断1是否出现在奇位数
            return (n & 0x55555555) != 0;

        }
    }
}
