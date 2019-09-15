package com.lsl.string;

public class FirstUniqChar {
	/**
	 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
	 * 案例:
	 * s = "leetcode"
	 * 返回 0.
	 * 
	 * s = "loveleetcode",
	 * 返回 2.
	 * 注意事项：您可以假定该字符串只包含小写字母。
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "cc";
		System.out.println(firstUniqChar(string));
	}
	public static int firstUniqChar(String s) {
		
		int index = -1;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if(i != j && s.charAt(i) == s.charAt(j)) {
					break;
				}
				if(j == s.length() - 1) {
					return i;
				}
			}
		}
        return index;
    }
}
