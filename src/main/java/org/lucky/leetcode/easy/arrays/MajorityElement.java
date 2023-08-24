package org.lucky.leetcode.easy.arrays;

import java.util.*;

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than [n / 2] times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2


Constraints:
n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109

 */
public class MajorityElement {

    public static void main(String [] args) {
        int nums[] = new int[]{1,2,1,2,1,3,1,4,1,2,5,2,1};
//        int nums[] = new int[]{3,2,3};
//        System.out.println(majorityElement_better(nums));
        System.out.println(majorityElement_single_pass(nums));
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int major_threshold = nums.length / 2;
        HashMap<Integer,Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for(Map.Entry<Integer, Integer> next : entries){
            Integer key = next.getKey();
            Integer value = next.getValue();
            if(value > major_threshold)
                return key;
        }
        return -1;
    }

    public static int majorityElement_better(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static int majorityElement_single_pass(int[] nums){
        int count=0;
        int candidate=0;
        for(int num : nums){

            if(count==0){
                candidate = num;
            }

            if(num==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}
