package com.lsl.string;


public class InvertIntData {

	public static void main(String[] args) {
		int num = 100;
		System.out.println(invertData(num));
	}
	
	public static int invertData(int x) {
		long num = 0;
		do {
			num = x % 10 + num * 10;
			x /= 10;
			System.out.println(num);
		}while(x  != 0);
		
		if(num < Integer.MIN_VALUE || num > Integer.MAX_VALUE) {
			return x;
		}else {
			return (int)num;
		}
	}
}
