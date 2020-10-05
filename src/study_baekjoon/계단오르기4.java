package study_baekjoon;

import java.util.Scanner;

public class 계단오르기4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] total = new int[N+1];
		int[] stairs = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			stairs[i] = in.nextInt();
		}
		
		//index=0은 시작점
		total[1] = stairs[1];
		
		//예외처리 : N이 1일 때를 방지
		if(N>=2) {
			total[2] = stairs[1] + stairs[2];
		}
		
		for(int i=3; i<=N; i++) {
			total[i] = Math.max(total[i-2], total[i-3] + stairs[i-1]) + stairs[i];
		}
		
		System.out.println(total[N]);
	}
}
