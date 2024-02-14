package leetcode;

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        // Build the hash table
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }

        // Find the complement
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int remain = target-num;
            if (map.containsKey(remain))
            {
                int index =map.get(remain);
                if (index==i)
                {
                    continue;
                }
//                above statement is only for special case let see an examaple
//                if target is 4 ,
//                let index element is 2 , and remain = 2 which is avail in hash table
//                so it returns that index 2 times  to prevent this we write above statement
                return new int[]{i,index};
            }

        }

        return new int[]{}; // No solution found
    }
}
class theSum
{
    public static void main(String[] args) {
        int[] nums = new int[] { 2,3,6,8};
        Solution s = new Solution();
        int []result =s.twoSum(nums,4);
        for (int m: result)
        {
            System.out.print(m+" ");
        }

    }
}