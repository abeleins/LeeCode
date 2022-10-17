package org.leecode.算法.Solution;

/**
 * @Author: abel
 * @Date: 2022/10/16 12:55
 * @Description:
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if (nums[i]+nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2,7,11,15};
        int target = 13;
        int[] ints = solution.twoSum(nums, target);
        System.out.println(ints[0]+"---"+ints[1]);
    }
}
