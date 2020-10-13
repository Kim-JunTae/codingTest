package study_baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class SQ1205_등수구하기 {

	public static void main(String[] args) {
		//시간 측정 : 시작
		long start = System.currentTimeMillis();
		
		int answer = -1;
		
		//입력
		//N : 리스트에 있는 점수의 갯수
		//newScore : 새로운 점수
		//P : 랭킹리스트에 올라갈 수 있는 점수의 갯수
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int newScore = stdIn.nextInt();
		int P = stdIn.nextInt();
		
		//점수리스트, 랭킹 리스트
		int[] scoreList = new int[N];
		int[] rankList = new int[P];

		//둘째줄 입력(비 오름차순) -> 현재 랭킹 리스트에 있는 점수들
		if(N > 0) {
			for(int i=0; i<N; i++) {
				scoreList[i] = stdIn.nextInt();
			}
		}
		
		//랭크 리스트 목록 구성
		//채워지지 않은 나머지 랭크 리스트는 0으로 초기화
		if(N == P){	//랭크리스트 사이즈와 주어진 점수 리스트 갯수가 같을 때
			for(int i=0; i<N; i++) {
				rankList[i] = scoreList[i];
			}
			//1. 오름차순 정렬
			Arrays.sort(rankList);
			//-> ex) 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
			
			//새로운 점수 입력
			for(int i=0; i<N-1; i++) {
				if(rankList[i] < newScore && rankList[i+1] > newScore){
					//2. 반전 -> 내림차순 정렬
					reverse(rankList);
					//-> ex) 100, 90, 80, 0, 0, 0, 0, 0, 0, 0
					
					//검색 및 출력
					for(int j=0; j<P; j++) {
						if(rankList[j] == newScore) {
							answer = j;
							break;
						}
					}
					break;
				}
			}
			
		}else{//랭크리스트 사이즈보다 주어진 점수 리스트 갯수가 작을 때 
			for(int i=0; i<N; i++) {
				rankList[i] = scoreList[i];
			}
			//빈 공간에 새로운 점수 입력
			rankList[N] = newScore;
			
			//오름차순 정렬
			Arrays.sort(rankList);
			//-> ex) newScore가 들어간 오름차순 정렬
			
			//2. 반전 -> 내림차순 정렬
			reverse(rankList);
			//-> ex) 100, 90, 80, 0, 0, 0, 0, 0, 0, 0
			
			//검색 및 출력
			for(int i=0; i<P; i++) {
				if(rankList[i] == newScore) {
					answer = i;
					break;
				}
			}
		}
		
//		for(int i=0; i<P; i++)
//			System.out.print(rankList[i] + " ");
		
		System.out.println("정답 : " + answer);
		
		//시간 측정 : 끝
		long end = System.currentTimeMillis();
		System.out.println("실행시간 : " + (end-start)/1000.0);
	}

	public static void reverse(int[] a) {
		for(int i=0; i<a.length/2; i++) {
			swap(a, i, a.length-i-1);
		}
	}
	
	public static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

}
