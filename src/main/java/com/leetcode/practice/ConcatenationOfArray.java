package com.leetcode.practice;

import java.util.Arrays;

public class ConcatenationOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1,3,2,1};
		System.out.println(Arrays.toString(getConcatenation(nums)));
	}

	public static int[] getConcatenation(int[] nums) {
		int n = nums.length;
		int[] ans = new int[2 * n];
		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[i];
			ans[i + n] = nums[i];
		}
		return ans;
	}
}
