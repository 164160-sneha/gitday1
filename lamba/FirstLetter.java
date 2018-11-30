package com.sneha.lamba;

import java.util.ArrayList;
import java.util.List;

public class FirstLetter {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Sneha");
		list.add("Jungkook");
		list.add("Swathi");
		list.add("Jeevan");
		list.add("Shreya");
		list.add("Karan");
		list.add("Reshma");
		list.add("Kishant");
		
		StringBuilder names = new StringBuilder();
		names.list().forEach(s-> n_name.append(s.charAt(0)));
		System.out.println(names);
	}
	

}
