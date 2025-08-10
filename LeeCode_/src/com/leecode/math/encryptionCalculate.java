package com.leecode.math;

public class encryptionCalculate {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.encryptionCalculate(5, -1));
    }

    static class Solution {
        public int encryptionCalculate(int dataA, int dataB) {
            while (dataB != 0) {
                int carry = dataA & dataB;
                dataA = dataA ^ dataB;
                dataB = carry << 1;
            }
            return dataA;
        }
    }
}
