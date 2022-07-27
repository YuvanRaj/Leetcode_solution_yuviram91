package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingRule {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<List<String>> items = new ArrayList<List<String>>();
		
		list1.add("phone");
		list1.add("blue");
		list1.add("pixel");
		items.add(list1);
		
		list1 = new ArrayList<String>();
		list1.add("computer");
		list1.add("silver");
		list1.add("lenovo");
		items.add(list1);
		
		list1 = new ArrayList<String>();
		list1.add("phone");
		list1.add("gold");
		list1.add("iphone");
		items.add(list1);
		
		System.out.println(countMatches(items, "type", "phone"));
		
		
	}

	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int count =0;
		for(List<String> list : items) {
			if("type".equalsIgnoreCase(ruleKey) && ruleValue.equalsIgnoreCase(list.get(0))) {
				count++;
			}
			else if("color".equalsIgnoreCase(ruleKey) && ruleValue.equalsIgnoreCase(list.get(1))) {
				count++;
			}
			else if("name".equalsIgnoreCase(ruleKey) && ruleValue.equalsIgnoreCase(list.get(2))) {
				count++;
			}
		}
		return count;

	}
}
