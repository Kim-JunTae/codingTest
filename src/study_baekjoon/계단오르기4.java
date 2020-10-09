package study_baekjoon;

import java.util.Scanner;

public class 계단오르기4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//계단의 갯수를 입력
		int N = in.nextInt();
		//각 계단의 점수를 담을 배열
		int[] stairs = new int[N+1];
		//각 계단의 점수를 입력
		for(int i=1; i<=N; i++) {
			stairs[i] = in.nextInt();
		}
		
		//계단에 숫자에 따른 최댓값을 넣을 배열 : Memoization
		int[] total = new int[N+1];
		
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
