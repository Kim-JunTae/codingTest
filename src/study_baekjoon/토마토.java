package study_baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 토마토 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		
		int day = -1;
		
		int[][] todayTomato = new int[M][N];
		int[][] tomorrowTomato = new int[M][N];

		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++){
				todayTomato[i][j] = in.nextInt();
			}
		}
		//시간 측정 : 시작
		long start = System.currentTimeMillis();
		
//		int day = -1;
//		//예제 1~5에서는 다 가능
//		int N = 2;
//		int M = 2;	
//		
//		int[][] todayTomato = {{1,-1},
//							   {-1,1}};
//		
//		int[][] tomorrowTomato = new int[M][N];	
		
		while(!Arrays.deepEquals(todayTomato, tomorrowTomato)) {
			//첫날을 제외한 오늘의 토마토 업데이트 : 2차원 배열 깊은 복사
			if(day != -1) {
				for(int i=0; i<M; i++) {
					for(int j=0; j<N; j++) {
						todayTomato[i][j] = tomorrowTomato[i][j];
					}
				}
			}else{
				for(int i=0; i<M; i++) {
					for(int j=0; j<N; j++) {
						tomorrowTomato[i][j] = 0;
					}
				}
			}
			//clone은 X
			//todayTomato = tomorrowTomato.clone();
				
			System.out.println("day : "+day);
			System.out.println("---todayTomato---");
			for(int i=0; i<M; i++) {
				for(int j=0; j<N; j++){
					System.out.print(todayTomato[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("-----------------");
			
			//하루가 지났다.
			day++;
			//익은 토마토 상하좌우 익게된다.
			for(int i=0; i<M; i++) {
				for(int j=0; j<N; j++){
					if(todayTomato[i][j] == 1) {
						
						tomorrowTomato[i][j] = 1;
						
						if(i-1 >= 0) {
							if(tomorrowTomato[i-1][j] != -1)
								tomorrowTomato[i-1][j] = 1;
						}
						
						if(j-1 >= 0) {
							if(tomorrowTomato[i][j-1] != -1)
								tomorrowTomato[i][j-1] = 1;
						}
						
						if(i+1 < M) {
							if(tomorrowTomato[i+1][j] != -1) {
								tomorrowTomato[i+1][j] = 1;
							}
						}
						
						if(j+1 < N) {
							if(tomorrowTomato[i][j+1] != -1)
								tomorrowTomato[i][j+1] = 1;
						}
					}else if(todayTomato[i][j] == -1) {
						tomorrowTomato[i][j] = -1;
					}
				}
			}
			
			System.out.println("---tomorrowTomato---");
			for(int i=0; i<M; i++) {
				for(int j=0; j<N; j++){
					System.out.print(tomorrowTomato[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("-----------------");
			
		}
		
		//최종 토마토 배열 검색
		int chk = 0;
		
		exit_For:	//레이블 설정
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(todayTomato[i][j] == 0) {
					chk = -1;
					break exit_For;
				}
			}
		}
		
		if(chk == -1) {
			System.out.println("답 : " + -1);
		}else{
			if(day == 0)
				System.out.println("답 : "+0);
			else
				System.out.println("답 : "+day);
		}
		
		//시간 측정 : 끝
		long end = System.currentTimeMillis();
		System.out.println("실행시간 : " + (end-start)/1000.0);
	}
}
