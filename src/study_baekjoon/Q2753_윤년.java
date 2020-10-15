package study_baekjoon;

import java.util.Scanner;

public class Q2753_À±³â {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int year = in.nextInt();

		if(year%4 == 0 && year%100 != 0 || year%400 == 0)
			System.out.println(1);
		else
			System.out.println(0);
	}

}
