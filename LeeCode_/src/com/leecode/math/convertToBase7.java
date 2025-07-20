package com.leecode.math;

/**
 * @author 张立业
 * @version 1.0
 */
public class convertToBase7 {
    public static void main(String[] args) {
        System.out.println(new Solution().convertToBase7(100));
    }

    static class Solution {
        public String convertToBase7(int num) {
            if (num == 0){
                return "0";
            }
            boolean isNegative = num < 0;
            if (isNegative){
                num = -num;
            }
            StringBuilder sb = new StringBuilder();
            while (num > 0){
                sb.append(num % 7);
                num /= 7;
            }
            if (isNegative){
                sb.append('-');
            }
            return sb.reverse().toString();
        }
    }
}
