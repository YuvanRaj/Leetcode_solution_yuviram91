package com.leetcode.practice;

public class LengthOfLastWord {

	public static void main(String[] args) {
		LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
		System.out.println(lengthOfLastWord.lengthOfLastWord("luffy is still joyboy"));
	}

	public int lengthOfLastWord(String s) {
		String[] str = s.split(" ");
		return str[str.length-1].length();
	}
}
