package org.leecode.算法.Solution;

import java.util.HashMap;

/**
 * @Author: abel
 * @Date: 2022/10/16 13:09
 * @Description:
 */
public class Solution03 {

    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>(len - 1);
        for (int i = 0; i < len; i++) {
            if (map.containsKey(nums[i])){
                return new int[]{i,map.get(nums[i])};
            }
            map.put(target - nums[i],i);
        }
        return null;
    }
    public static void main(String[] args) {
        Solution03 solution = new Solution03();
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] ints = solution.twoSum(nums, target);
        System.out.println(ints[0]+"---"+ints[1]);
    }
}
