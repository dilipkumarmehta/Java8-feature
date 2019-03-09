package com.dilip.test;

public class ArraySecond {
	public static void main(String[] args) {

		int[] arr = new int[] { 2, 3, 4, 5, 6, 1, 80, 90, 38, 33, 45, 2, 5, 0, 4242, 6 };
		int h = 0;
		int sh = 0;
		int tr = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > h) {
				tr = sh;
				sh = h;
				h = arr[i];
			}
		}
		System.out.println(h);
		System.out.println(sh);
		System.out.println(tr);
	}
}
