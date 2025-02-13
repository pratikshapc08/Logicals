package com.forloop;

public class CountDigit {
public static void main(String[] args) {
	int a=12345;
	int count=0;
	for(; a>0;) {
		count++;
		a/=10;
	}
	System.out.println(count);
}
}
