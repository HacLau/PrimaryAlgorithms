package com.lsl.string;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string =  "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(string));
		String string2 =   "race a car";
		System.out.println(isPalindrome(string2));
	}
	public static boolean isPalindrome(String s) {
		s = s.toLowerCase();
		s = format(s);
		System.out.println(s);
		boolean b = true;
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				b = false;
				break;
			}
		}
		return b;
	}
	public static String format(String s){
		String str=s.replaceAll("[^0-9a-zA-Z]+","");
		return str; 
	}
	

}
