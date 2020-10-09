package study_baekjoon;

import java.util.Scanner;

public class 계단오르기3 {

	static Integer total[];
	static int stairs[];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//계단의 갯수 입력
		int N = in.nextInt();
		//각 계단의 점수를 담을 배열
		stairs = new int[N+1];
		//각 계단의 점수 입력
		for(int i=1; i<=N; i++) {
			stairs[i] = in.nextInt();
		}
		
		//계단의 갯수에 따른 최댓값을 담을 배열, 동적계획법(Dynamic Programming)
		total = new Integer[N+1];
		
		
		total[0] = stairs[0];	//디폴트 값이 null이므로 0으로 초기화
		total[1] = stairs[1];
		
		if(N>=2) {
			total[2] = stairs[1] + stairs[2];
		}
		
		System.out.println(find(N));
	}
	
	static int find(int N) {
		//아직 탐색하지 않은 N번쨰 계단일 경우
		if(total[N] == null) {
			total[N] = Math.max(find(N-2), find(N-3)+stairs[N-1]) + stairs[N];
		}
		
		return total[N];
	}

}
