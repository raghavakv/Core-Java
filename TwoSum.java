package com.leetcode;

//import java.util.Scanner;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int n = nums.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { 1, 2 }; // No solution found
	}

	public static void main(String[] args) {
		TwoSum t = new TwoSum();
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] result = t.twoSum(nums, target);
		if (result.length == 2) {
			System.out.println("[" + result[0] + "," + result[1] + "]");
		} else {
			System.out.println("No solution found");
		}
		int[] nums2 = { 3, 2, 4 };
		int target2 = 6;
		int[] result2 = t.twoSum(nums2, target2);
		System.out.println("\nExample 2:");
		System.out.println("Input: nums = [3,2,4], target = 6");
		System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]");

		int[] nums3 = { 3, 3 };
		int target3 = 6;
		int[] result3 = t.twoSum(nums3, target3);
		System.out.println("\nExample 3:");
		System.out.println("Input: nums = [3,3], target = 6");
		System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]");
	}
}
