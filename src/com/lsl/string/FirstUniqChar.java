package com.lsl.string;

public class FirstUniqChar {
	/**
	 * ����һ���ַ������ҵ����ĵ�һ�����ظ����ַ���������������������������ڣ��򷵻� -1��
	 * ����:
	 * s = "leetcode"
	 * ���� 0.
	 * 
	 * s = "loveleetcode",
	 * ���� 2.
	 * ע����������Լٶ����ַ���ֻ����Сд��ĸ��
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
