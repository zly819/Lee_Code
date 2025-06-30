package com.leecode.math;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张立业
 * @version 1.0
 * 自除数 是指可以被它包含的每一位数整除的数。
 *
 * 例如，128 是一个 自除数 ，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
 * 自除数 不允许包含 0 。
 *
 * 给定两个整数 left 和 right ，返回一个列表，列表的元素是范围 [left, right]（包括两个端点）内所有的 自除数
 *
 * 示例 1：
 *
 * 输入：left = 1, right = 22
 * 输出：[1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 */
public class elfDividingNumbers {
    public static void main(String[] args) {
        System.out.println(new Solution().selfDividingNumbers(1, 2));
    }

    static class Solution {
        public List<Integer> selfDividingNumbers(int left, int right) {
            List<Integer> res = new ArrayList<>();
            //遍历区间内的每一个数
            for (int i = left; i <= right; i++) {
                //判断是否为自除数
                if (isSelfDividing(i)) {
                    res.add(i);
                }
            }
            return res;
        }

        private static boolean isSelfDividing(int num) {
            int original = num;
            while (num > 0) {
                int digit = num % 10;
                if (digit == 0 || original % digit != 0) {
                    return false;
                }
                num /= 10;
            }
            return true;
        }
    }
}


