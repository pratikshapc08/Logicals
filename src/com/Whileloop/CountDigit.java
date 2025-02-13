package com.Whileloop;

public class CountDigit {
	public static void main(String[] args) {
		int a = 123456;
		int count = 0;
		while (a > 0) {
			count++;
			a /= 10;
		}
		System.out.println(count);
	}
}
