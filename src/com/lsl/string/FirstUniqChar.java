package com.lsl.string;

public class FirstUniqChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "ccl";
		System.out.println(firstUniqChar(string));
	}
	public static int firstUniqChar(String s) {
		boolean b = false;
		int index = -1;
		for (int i = 0; i < s.length(); i++) {
			b = false; 
			for (int j = 0; j < s.length(); j++) {
				if(i != j) {
					if (s.charAt(i) == s.charAt(j)) {
						b = true;
					}
					if (j == s.length() - 1 && !b) {
						return i;
					}
				}
			}
		}
        return index;
    }

}
