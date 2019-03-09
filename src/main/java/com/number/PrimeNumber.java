package com.number;

//prime number 1to 100
public class PrimeNumber {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 20; i++) {
			for (int j = 1; j <= i/2; j++) {
				if (i % j == 0) {
					count++;
				} 
			}
			if (count >= 2) {
				System.out.println("Not Prime Number = " + i);
			} else {
				System.err.println("Prime Number = " + i);
			}
			
			count=0;
		}
	}
}
