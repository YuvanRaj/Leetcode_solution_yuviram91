package com.leetcode.practice;

import java.util.List;

public class CountItemsMatchingRule {

	public static void main(String[] args) {
		System.out.println(result());
	}

	public static int result() {
		try {
			int a = 10 / 0;
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}

	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int count = 0;
		for (List<String> list : items) {
			if ("type".equalsIgnoreCase(ruleKey) && ruleValue.equalsIgnoreCase(list.get(0))) {
				count++;
			} else if ("color".equalsIgnoreCase(ruleKey) && ruleValue.equalsIgnoreCase(list.get(1))) {
				count++;
			} else if ("name".equalsIgnoreCase(ruleKey) && ruleValue.equalsIgnoreCase(list.get(2))) {
				count++;
			}
		}
		return count;

	}
}
