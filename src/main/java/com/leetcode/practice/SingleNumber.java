package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;


public class SingleNumber {

	public static void main(String[] args) {
		SingleNumber test = new SingleNumber();
		int[] nums = new int[] {4,1,2,1,2};
		System.out.println(test.singleNumber(nums));
	}

	public int singleNumber(int[] nums) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) != null) {
				int count = map.get(nums[i])+1;
				map.put(nums[i],count);

			} else {
				map.put(nums[i], 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return 0;

	}

}
