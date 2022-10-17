package org.leecode.算法.Solution;

import java.util.HashMap;

/**
 * @Author: abel
 * @Date: 2022/10/16 13:09
 * @Description:
 */
public class Solution02 {

    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>(len - 1);
        map.put(nums[0],0);
        for (int i = 1; i < len; i++) {
            if (map.containsKey(target - nums[i])){
                return new int[]{i,map.get(target - nums[i])};
            }
            map.put(nums[i],i);
        }
        return null;
    }
    public static void main(String[] args) {
        Solution02 solution = new Solution02();
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] ints = solution.twoSum(nums, target);
        System.out.println(ints[0]+"---"+ints[1]);
    }
}
