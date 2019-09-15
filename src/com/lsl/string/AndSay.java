package com.lsl.string;

public class AndSay {

	public static void main(String[] args) {
		//"312211"
		int n = 6;
		System.out.println(countAndSay(n));
	}
	
	public static String countAndSay(int n) {
		String string = "1";
		for (int i = 0; i < n - 1; i++) {
			int x = 0;
			String temString = "";
			for (int j = 0; j < string.length();  j ++) {
				for (int k = j; k < string.length(); k++) {
					if(string.charAt(j) == string.charAt(k)) {
						x ++;
					}else {
						j = k;
						temString =  temString + String.valueOf(x) +string.charAt(j - 1);
						x = 1;
						
					}
					if (k == string.length() - 1) {
						j = k;
						temString =  temString + String.valueOf(x) +string.charAt(j);
						
					}
				}
				
				
			}
			string = temString;
		}
		return string;
	}

}
