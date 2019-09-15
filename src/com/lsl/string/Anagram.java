package com.lsl.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a";
		String t = "b";
		System.out.println(isAnagram(s, t));
	}
	
	public static boolean isAnagram(String s, String t) {
		if(s.length() != t.length())
			return false;
		s = s.toLowerCase();
		t = t.toLowerCase();
		char[] cS = s.toCharArray();
		char[] cT = t.toCharArray();
		Arrays.sort(cS);
		Arrays.sort(cT);
		s = String.valueOf(cS);
		t = String.valueOf(cT);
		if (s.equals(t)) {
			return true;
		}else {
			return false;
		}
    }
	
	

}
