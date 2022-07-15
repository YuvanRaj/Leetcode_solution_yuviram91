package com.leetcode.practice;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		SortString sortString = new SortString();
		System.out.println(sortString.sortString("fedcba"));
	}

	public String sortString(String input) {
		char[] charArr = input.toCharArray();
		Arrays.sort(charArr);
		return String.valueOf(charArr);
	}

}
