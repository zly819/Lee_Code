package com.leecode.math;

import java.util.Scanner;

/**
 * @author 张立业
 * @version 1.0
 */
public class convertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("celsius = ");
        double value = scanner.nextDouble();

        Solution solution = new Solution();
        double[] result = solution.convertTemperature(value);

        System.out.printf("%.5f, %.5f",result[0],result[1]);
        scanner.close();


    }
    static class Solution {
        public double[] convertTemperature(double celsius) {
            double[] ans = new double[2];
            ans[0] = celsius + 273.15;
            ans[1] = celsius * 1.80 + 32.00;
            return ans;
        }
    }

}
