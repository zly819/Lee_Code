package com.leecode.math;

/**
 * @author 张立业
 * @version 1.0
 * 反转 一个整数意味着倒置它的所有位。
 *
 * 例如，反转 2021 得到 1202 。反转 12300 得到 321 ，不保留前导零 。
 * 给你一个整数 num ，反转 num 得到 reversed1 ，接着反转 reversed1 得到 reversed2 。
 * 如果 reversed2 等于 num ，返回 true ；否则，返回 false 。
 *
 * 输入：num = 526
 * 输出：true
 * 解释：反转 num 得到 625 ，接着反转 625 得到 526 ，等于 num 。
 */
public class isSameAfterReversals {
    public static void main(String[] args) {
        System.out.println(new Solution().isSameAfterReversals(0));
    }
    static class Solution {
        public boolean isSameAfterReversals(int num) {
            return num == 0 ||num % 10 != 0 ? true : false;
        }
    }
}
