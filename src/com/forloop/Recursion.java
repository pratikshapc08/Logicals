package com.forloop;

public class Recursion {
public static int factorial(int N) {
	if(N== 0 || N<0) {
		return 1;
	}else {
		return N*factorial(N-1);
	}
}
}
