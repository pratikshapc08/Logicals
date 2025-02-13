package com.Whileloop;

public class Pallindrome {
	public static void main(String[] args) {
		int a = 12345;
		int ognum = a;
		int rev = 0;
		while (a > 0) {
			int digit = a % 10;
			rev = (rev * 10) + digit;
			a/=10;
			System.out.println(ognum);
		}
		if (rev == ognum) {
			System.out.println("pallindrome");
		} else {
			System.out.println("not pallindrome");

		}
	}
}
