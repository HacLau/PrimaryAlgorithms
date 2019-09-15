package com.lsl.string;

public class ReverseString {

	public static void main(String[] args) {
		char[] s = new char[] {'h','e','l','l','o'};
		reverseString(s);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i] + ",");
		}
		
	}
	public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
			char t = s[i];
			s[i] = s[s.length - 1 - i];
			s[s.length - 1 - i] = t;
		}
    }
}
