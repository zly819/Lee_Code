package com.leecode.math;

/**
 * @author 张立业
 * @version 1.0
 * 给你一个整数 num ，返回 num 中能整除 num 的数位的数目。
 *
 * 如果满足 nums % val == 0 ，则认为整数 val 可以整除 nums 。
 */
public class countDigits {
    static class Solution {
        public int countDigits(int num) {
            int originalNum = num;//防止初始数被修改
            int count = 0;
            while (num > 0) {
                int digit = num % 10;//取出当前最低位数字
                if (digit != 0 && originalNum % digit == 0) {
                    count++;
                }
                num = num / 10;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countDigits(7));
        System.out.println(new Solution().countDigits(121));
        System.out.println(new Solution().countDigits(1248));
    }
}
