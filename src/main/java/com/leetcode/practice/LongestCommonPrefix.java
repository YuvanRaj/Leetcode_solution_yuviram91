package com.leetcode.practice;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] s = new String[]{"flower","flow","flight"};
		LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
		System.out.println(longestCommonPrefix.longestCommonPrefix(s));
	}

	public String longestCommonPrefix(String[] strs) {
		 String longestPrefix = strs[0];
	        
	        for (int i = 1; i < strs.length; i++) {
	            while(strs[i].indexOf(longestPrefix) != 0) { 
				// If the str value does not match, the last char from the longest prefix is removed until it does match
	                longestPrefix = longestPrefix.substring(0, longestPrefix.length() - 1);
	            }
	        }
	        return longestPrefix;

	}

}
