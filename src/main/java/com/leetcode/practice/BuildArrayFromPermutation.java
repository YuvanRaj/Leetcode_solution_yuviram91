package com.leetcode.practice;

import java.util.Arrays;

public class BuildArrayFromPermutation {

	public static void main(String[] str) {
		int[] input = new int[] {0,2,1,5,3,4};
		BuildArrayFromPermutation buildArrayFromPermutation = new BuildArrayFromPermutation();
		System.out.println(Arrays.toString(buildArrayFromPermutation.buildArray(input)));
	}


	
	public int[] buildArray(int[] nums) {
	    int n = nums.length;
	    for (int i = 0; i < n; i++){
	       nums[i] = nums[i] + n * (nums[nums[i]] % n); 
	    }
	      

	    for (int i = 0; i < n; i++)
	      nums[i] = nums[i]/n;

	    return nums;
	  }
}
