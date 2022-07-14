package com.leetcode.practice;

public class PermutationCombination {

	public static void main(String[] args) {
		PermutationCombination.permuTation("abb", "");
	}

	public static void permuTation(String str, String ans) {
		// Base condition
		if (str.length() == 0) {
			System.out.println(ans+" ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String res = str.substring(0, i) + str.substring(i + 1);
			permuTation(res, ans+ch);
		}
	}
}
