package com.forloop;

public class PrimeNum {
	public static void main(String[] args) {
		int a = 56;
		// int count=0;
		boolean flag = true;
		for (int i = 2; i < a; i++) {
			if (a % i == 0)
				flag = false;
			// count++;
		}
//if(count==0)
		if (flag) {

			System.out.println("prime number");

		} else {
			System.out.println("not prime");
		}
	}
}
