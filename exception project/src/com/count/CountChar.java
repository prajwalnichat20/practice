package com.count;

public class CountChar {
	public static long count(String str) {
		long ch =str.chars().filter(a->a=='o').count();
		return ch;
	}
	public static void main(String[] args) {
		String s="Prajwal is onjjjjjjjj job";
		System.out.println(count(s));
	}

}
