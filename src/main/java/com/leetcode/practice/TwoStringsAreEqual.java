package com.leetcode.practice;

public class TwoStringsAreEqual {

	public static void main(String[] args) {
		String[] word1 = {"ab","c"};
		String[] word2 = {"a","bca"};
		TwoStringsAreEqual twoStringsAreEqual = new TwoStringsAreEqual();
		System.out.println(twoStringsAreEqual.arrayStringsAreEqual(word1, word2));
	}

	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		return getStringValue(word1).equalsIgnoreCase(getStringValue(word2));
	}

	public String getStringValue(String[] inputArr) {
		StringBuilder builder = new StringBuilder();
		for (String val : inputArr) {
			builder.append(val);
		}
		return builder.toString();
	}
}
