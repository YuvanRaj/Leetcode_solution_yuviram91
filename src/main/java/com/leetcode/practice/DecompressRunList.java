package com.leetcode.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecompressRunList {

	public static void main(String[] args) {
		int[] nums = new int[] {1,1,2,3};
		System.out.println(Arrays.toString(decompressRLElist(nums)));
		
	}

	public static int[] decompressRLElist(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i = i + 2) {
			int frequecny = nums[i];
			int val = nums[i + 1];
			while (frequecny > 0) {
				list.add(val);
				frequecny--;
			}
		}
		int[] ans = list.stream().mapToInt(Integer::intValue).toArray();
		return ans;
	}
}
