package com.forloop;

public class ReverseNum {
	public static void main(String[] args) {
		int a = 12345;
		int rev = 0;
		for (; a != 0; a /= 10) {
			int digit = a % 10;
			rev = (rev * 10) + digit;
			//a /= 10;
		}
		System.out.println(rev);
	}
}
