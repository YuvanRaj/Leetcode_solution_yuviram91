package com.leetcode.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArray {

	public static void main(String[] args) {
		int[] nums = new int[] { 1 };
		int[] index = new int[] { 0 };

		System.out.println(Arrays.toString(createTargetArray(nums, index)));
	}

	public static int[] createTargetArray(int[] nums, int[] index) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			list.add(index[i], nums[i]);
		}

		int[] ans = new int[list.size()];
		for (int i = 0; i < nums.length; i++) {
			ans[i] = list.get(i);
		}
		return ans;
	}

}
