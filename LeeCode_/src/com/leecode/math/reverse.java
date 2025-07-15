package com.leecode.math;

/**
 * @author 张立业
 * @version 1.0
 * 整数反转
 */
public class reverse {

    public static void main(String[] args) {
        System.out.println(new Solution().reverse(123));
    }


    static class Solution {
        public int reverse(int x) {
            int revesed = 0;
            while (x != 0) {
                int digit = x % 10;
                x = x / 10;
                //判断是否会发生正溢出
                if (revesed > Integer.MAX_VALUE / 10 || (revesed == Integer.MAX_VALUE / 10 && digit > 7)) {
                    return 0;
                }
                //判断是否会发生负溢出
                if (revesed < Integer.MIN_VALUE / 10 || (revesed == Integer.MIN_VALUE / 10 && digit < -8)) {
                    return 0;
                }

                revesed = revesed * 10 + digit;
            }
            return revesed;

        }
    }
}
