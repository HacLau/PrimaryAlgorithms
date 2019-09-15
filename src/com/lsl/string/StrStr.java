package com.lsl.string;

public class StrStr {

	public static void main(String[] args) {
		String haystack = "hello";
		String needle = "ll";
		System.out.println(strStr(haystack,needle));
	}
	
	public static int strStr(String haystack, String needle) {
        int index = -1;
		for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
			if(haystack.substring(i,i + needle.length()).equals(needle)) {
				index = i;
				break;
			}
		}
        return index;
    }
}
