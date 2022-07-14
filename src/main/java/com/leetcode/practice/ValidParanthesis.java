package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

public class ValidParanthesis {

	public static Map<Character, Character> test = new HashMap<Character, Character>();

	public static void main(String[] args) {
		ValidParanthesis validParanthesis = new ValidParanthesis();
		System.out.println(validParanthesis.isValid("([)]"));
	}

	static {
		test.put('(', ')');
		test.put('{', '}');
		test.put('[', ']');
	}

	public boolean isValid(String s) {
		Character nextChar = null;
		for (int i = 0; i < s.toCharArray().length; i++) {
			if (i % 2 == 0) {
				nextChar = test.get(s.charAt(i));
			} else {
				if (nextChar == s.charAt(i)) {
					nextChar = null;
				}
				else {
					break;
				}
			}
		}
		return nextChar == null ? true : false;
	}

}
