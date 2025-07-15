package com.leecode.math;

/**
 * @author 张立业
 * @version 1.0
 */
public class largestPalindrome {
    public static void main(String[] args) {
        System.out.println(new Solution().largestPalindrome(2));
    }


    static class Solution {
        public int largestPalindrome(int n) {
            //特殊情况初处理
            if (n == 1){
                return 9;
            }
            //计算n位数得最大值和最小值
            long max = (long) Math.pow(10, n) - 1;
            long min = (long) Math.pow(10, n - 1);
            long maxproduct = max * max;

            //从最大的可能回文开始找,先取出一串数字的前半部分
            long half = maxproduct / (long)Math.pow(10,n);

            boolean found = false;
            long palindrome = 0;

            while (!found) {
                //构造回文数
                palindrome = createPalindrome(half);

                //检查是否能分解为两个n位数的乘积
                for (long i = max; i >= min; i--) {
                    //当 i 的平方小于当前回文数 palindrome 时，说明 i 已经太小，不可能再找到更大的因数，直接跳出循环。
                    if (i * i < palindrome){
                        break;
                    }
                    if (palindrome % i == 0){
                        found = true;
                        break;
                    }
                }
                half--;
            }
            return (int)(palindrome % 1337);
        }

        private long createPalindrome(long half) {
            //1.将前半部分数字转换成字符串
            String s = Long.toString(half);
            //2.将字符串 反转，得到它的逆序字符串
            String reverse = new StringBuilder(s).reverse().toString();
            //3.将原字符串和它的逆序拼接，然后转换成 long 类型的数字，最终返回这个回文数。
            return Long.parseLong( s + reverse);
        }
    }
}
