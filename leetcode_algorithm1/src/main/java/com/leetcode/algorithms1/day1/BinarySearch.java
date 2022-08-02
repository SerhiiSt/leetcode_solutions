package com.leetcode.algorithms1.day1;

//704.Binary Search
public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int med = left + (right - left) / 2;
            if (nums[med] == target) return med;
            if (nums[med] < target) left = med + 1;
            if (nums[med] > target) right = med - 1;
        }
        return -1;
    }
}
