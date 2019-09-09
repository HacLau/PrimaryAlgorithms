package com.lsl.array;



public class Intersect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = new int[] {1,2,2,1};
		int[] nums2 = new int[] {1,1};
		int[] num1 = intersect(nums1, nums2);
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + ",");
		}
		System.out.println();
//		int[] nums3 = new int[] {4,9,5};
//		int[] nums4 = new int[] {9,4,9,8,4};
//		int[] num2 = intersect(nums3, nums4);
//		for (int i = 0; i < num2.length; i++) {
//			System.out.print(num2[i] + ",");
//		}
	}
	
	 public static int[] intersect(int[] nums1, int[] nums2) {
		 int[] t = new int[nums1.length];
		 for (int i = 0; i < t.length; i++) {
			 t[i] = nums1[i];
			 System.out.print(t[i] + ",");
		}
		 System.out.println();
		System.out.println("--------------------");
		 int len = removeDuplicates(t);
		 int[] te = new int[len];
		 for (int i = 0; i < te.length; i++) {
			 te[i] = t[i];
			 System.out.print(te[i] + ",");
		 }
		 System.out.println();
		System.out.println("--------------------");
		 int[][] temp = new int[te.length][3];
		 for (int i = 0; i < temp.length; i++) {
			temp[i][0] = te[i];
			for (int j = 0; j < nums1.length; j++) {
				if(temp[i][0] == nums1[j]) {
					temp[i][1] ++;
				}
				
			}
		}
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if(temp[i][0] == nums2[j]) {
					temp[i][2] ++;
				}
			}
		} 
		for (int i = 0; i < temp.length; i++) {
			System.out.println("[" + temp[i][0] + "," + temp[i][1] + "," + temp[i][2] + "]");
		}
		 System.out.println();
		System.out.println("--------------------");
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
			if(temp[i][2] == 0)
				continue;
			if(temp[i][1] < temp[i][2]) {
				count += temp[i][1];
			}else {
				count += temp[i][2];
			}
		}
		int[] result = new int[count];
		count = 0;
		for (int i = 0; i < temp.length; i++) {
			if(temp[i][2] == 0)
				continue;
			int x = 0;
			if(temp[i][1] < temp[i][2]) {
				x += temp[i][1];
			}else {
				x += temp[i][2];
			}
			for (int j = count; j < count + x; j++) {
				result[j] = temp[i][0];
			}
			count += x;
		}
		return result;
	 }
	 
	 public static int removeDuplicates(int[] nums) {
		 int n = nums.length;
			for (int i = nums.length - 1; i >= 0; i--) {
			    for (int j = i - 1; j >= 0; j--) {
					if(nums[i] == nums[j]) {
						n --;
						for (int k = j; k < nums.length - 1; k++) {
							nums[k] = nums[k + 1];
						}
	                    
						break;
					}
				}

			}
			 return n;
		}
	 
	 
	 

}
