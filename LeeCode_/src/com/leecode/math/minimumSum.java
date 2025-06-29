package com.leecode.math;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 张立业
 * @version 1.0
 * 给你一个四位 正 整数 num 。请你使用 num 中的 数位 ，将 num 拆成两个新的整数 new1 和 new2 。
 * new1 和 new2 中可以有 前导 0 ，且 num 中 所有 数位都必须使用。
 *
 * 比方说，给你 num = 2932 ，你拥有的数位包括：两个 2 ，一个 9 和一个 3 。
 * 一些可能的 [new1, new2] 数对为 [22, 93]，[23, 92]，[223, 9] 和 [2, 329] 。
 * 请你返回可以得到的 new1 和 new2 的 最小 和
 */
public class minimumSum {
    static class Solution {
        public int minimumSum(int num) {
            //1、提取 num 的每一位数字
            int[] digits = new int [4];
            digits[0] = num /1000 ;         //千位
            digits[1] = (num / 100) % 10;   //百位
            digits[2] = (num % 100) / 10;   //十位
            digits[3] = num % 10;         //个位
            //2.构造最小的两个new1, new2
            //1).将四位数进行排序，将最小的两位数分别作为new1,new2的十位数
            //2).剩下的两位数作为低位数

            //对数组进行排序
            Arrays.sort(digits);
            int new1 = digits[0] * 10 + digits[2];
            int new2 = digits[1] * 10 + digits[3];
            return new1 + new2;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().minimumSum(2932));
        System.out.println(new Solution().minimumSum(4009));
    }
}
