package com.lsl.string;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"c","c","c"};
		System.out.println(longestCommonPrefix(strs));
	}
	public static String longestCommonPrefix(String[] strs) {
		if(strs.length < 1) {
	        return "";
	    }
		if(strs.length == 1) {
	        return strs[0];
	    }
		int len = Integer.MAX_VALUE;
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length() <= 0) {
				return "";
			}
			if (strs[i].length() < len) {
				len = strs[i].length();
			}
		}
        String string = "";
        String string2 = "";
        boolean b = false;
       
        for (int i = 0; i <= len; i++) {
        	string = strs[0].substring(0,i);
			for (int j = 0; j < strs.length; j++) {
				if(!string.equals(strs[j].substring(0,i))) {
					b = true;
					break;
				}
			}
			if(b)
				break;
			else 
				string2 = string;
			
		}
        return string2;
    }

}
