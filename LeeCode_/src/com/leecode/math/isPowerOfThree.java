package com.leecode.math;

/**
 * @author 张立业
 * @version 1.0
 */
public class isPowerOfThree {

    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfThree(45));
    }

    static class Solution {
        public boolean isPowerOfThree(int n) {
            if(n <= 0) return false;
            while(n % 3 == 0){
                n /= 3;
            }
            return n == 1;
        }
    }
}
