package com.leecode.math;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author 张立业
 * @version 1.0
 */
public class nearestPalindromic {
    public static void main(String[] args) {
        System.out.println(new Solution().nearestPalindromic("88"));
    }

    static class Solution {
        public String nearestPalindromic(String n) {
            //定义字符串长度
            int len = n.length();
            //转化为长整型
            long cur = Long.parseLong(n);
            //表示该数是否为奇数
            boolean isOdd = len % 2 == 1;
            //创建集合存储可能的回文数
            HashSet<Long> set = new HashSet<>();
            //添加999类型
            set.add((long) Math.pow(10, len - 1) - 1);
            //添加1001类型
            set.add((long) Math.pow(10, len) + 1);
            //前半数
            long half = cur / (long) Math.pow(10, len / 2);
            //遍历
            for (long i = half - 1; i <= half + 1; ++i) {
                //添加
                set.add(getPalin(i, isOdd));
            }
            //删除自己
            set.remove(cur);
            //找间隔最小的回文
            long min = Long.MIN_VALUE;
            for (long i : set) {
                //小于最小的
                if (Math.abs(i - cur) < Math.abs(min - cur)) {
                    min = i;
                }
                //等于最小的，取两者最小
                else if (Math.abs(i - cur) == Math.abs(min - cur)) {
                    min = Math.min(i, min);
                }
            }
            return String.valueOf(min);
        }

        //bef为前一半的数字，isOdd为字符串是否为奇数
        public long getPalin(long bef, boolean isOdd) {
            //结果
            long res = bef;
            //奇数
            if (isOdd) {
                //不填添加最后一个
                res /= 10;
            }
            //补后面
            while (bef > 0) {
                res *= 10;
                res += bef % 10;
                bef /= 10;
            }
            return res;
        }
    }
}

