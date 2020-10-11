package study_baekjoon;

import java.util.Scanner;

public class Q10869_사칙연산 {
	public static void main(String[] args) {
		//시간 측정 : 시작
		long start = System.currentTimeMillis();
		
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
		
		//시간 측정 : 끝
		long end = System.currentTimeMillis();
		System.out.println("실행시간 : " + (end-start)/1000.0);
	}
}
