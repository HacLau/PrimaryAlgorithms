package com.lsl.string;

public class Atoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "2147483648";
		System.out.println(myAtoi(string));
	}
	public static int myAtoi(String str) {
		if (str.length() == 0) {
			return 0;
		}
		str = str.trim();
		char[] c = str.toCharArray();
		
		Long resultNumber = 0L;
		int singn = 1;
		for (int i = 0; i < c.length; i++) {
			
			
			if(i == 0 && (c[0] != '-' && c[0] != '+') &&  (c[i] < 48 || c[i] > 57)) {
				return (int) (resultNumber * singn);
			}else if(i >= 1 && (c[i] < 48 || c[i] > 57)) {
				return (int) (resultNumber * singn);
			}
			if(c[i] == '-') {
				singn = -1;
			}else if(c[i] == '+') {
				singn = 1;
			}else {
				resultNumber = (Long) (resultNumber  * 10  + Integer.valueOf(c[i] - 48));
			}
			if (resultNumber * singn > Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			}
			if(resultNumber * singn < Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}
			
		}
		return (int) (resultNumber * singn);
		
		
	}

}
