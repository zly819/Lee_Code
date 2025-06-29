package com.leecode.math;

import java.util.Scanner;

/**
 * @author 张立业
 * @version 1.0
 */
public class smallestEvenMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();
        System.out.println(new Solution().smallestEvenMultiple(n));

    }

    static class Solution {
        public int smallestEvenMultiple(int n) {
            //如果 n 是偶数，则最小公倍数就是n, 如果是奇数，则是2*n
            return (n % 2 == 0 ? n : n * 2);
        }
    }
}
