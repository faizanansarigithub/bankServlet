package com.fa.basic;

import java.util.Random;

public class RandomAccountAndPin {
	public static long generatedAccount() {
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		sb.append(random.nextInt(9) + 1);
		for (int i = 0; i < 11; i++) {
			sb.append(random.nextInt(10));
		}
		return Long.valueOf(sb.toString()).longValue();
	}	
	//==========================================================================
	public static long genratedPin() {
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		sb.append(random.nextInt(9) + 1);
		for (int i = 0; i < 3; i++) {
			sb.append(random.nextInt(10));
		}
		return Long.valueOf(sb.toString()).longValue();
	}
}
