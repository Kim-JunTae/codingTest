package study_baekjoon;

import java.util.Scanner;

public class SQ2163_초콜릿자르기 {
	static int N = 300;
	static int M = 300;
	
	public static void main(String[] args) {
		//시간 측정 : 시작
		long start = System.currentTimeMillis();
				
		//int answer = 0;
		//Scanner stdIn = new Scanner(System.in);
		//int M = stdIn.nextInt();	
		//answer = N*M-1;
		
		System.out.println(N*M-1);	
		
		//시간 측정 : 끝
		long end = System.currentTimeMillis();
		System.out.println("실행시간 : " + (end-start)/1000.0);
	}
}