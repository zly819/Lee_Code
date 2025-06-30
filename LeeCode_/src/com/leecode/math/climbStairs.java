package com.leecode.math;

/**
 * @author 张立业
 * @version 1.0
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class climbStairs {
    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(4));
    }

    static class Solution {
        public int climbStairs(int n) {
            /**
             * 1、 1                            f(1) = 1
             * 2、 1+1，2                       f(2) = 2
             * 3、 1+1+1，1+2，2+1               f(3) =3
             * 4、 1+1+1+1，1+1+2，1+2+1,2+2,2+1+1,     5
             *
             */
         if (n <= 2) {
             return n;
         }
         int a = 1, b = 2;
         for (int i = 3; i <= n; i++) {
             int c = a + b;
             a = b;
             b = c;
         }
         return b;

        }
    }
}

class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;

    }
}
