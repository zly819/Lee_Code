package com.leecode.math;

import java.util.Scanner;

/**
 * @author 张立业
 * @version 1.0
 */
public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("num1= ");
        int value01 = scanner.nextInt();
        System.out.print("num2= ");
        int value02 = scanner.nextInt();
        Solution solution = new Solution();
        System.out.println(solution.sum(value01, value02));

    }

    static class Solution {
        public int sum(int num1, int num2) {
            return num1 + num2;
        }
    }
}
