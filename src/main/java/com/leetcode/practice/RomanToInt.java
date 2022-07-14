package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

	public static void main(String[] args) {
		RomanToInt romanToInt = new RomanToInt();
		System.out.println(romanToInt.romanToInt("LVIII"));
	}

	public static Map<Character, Integer> romanToIntMap = new HashMap<Character, Integer>();
	static {
		romanToIntMap.put('I', 1);
		romanToIntMap.put('V', 5);
		romanToIntMap.put('X', 10);
		romanToIntMap.put('L', 50);
		romanToIntMap.put('C', 100);
		romanToIntMap.put('D', 500);
		romanToIntMap.put('M', 1000);
	}

	public int romanToInt(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i + 1 < s.length()) {
				if (romanToIntMap.get(s.charAt(i)) >= romanToIntMap.get(s.charAt(i + 1)))
					count += romanToIntMap.get(s.charAt(i));
				else {
					int subtract = romanToIntMap.get(s.charAt(i+1)) - romanToIntMap.get(s.charAt(i));
					count += subtract;
					i++;
				}
			} else {
				count += romanToIntMap.get(s.charAt(i));
			}
		}
		return count;
	}
}
