package study_baekjoon;

import java.util.Scanner;

public class SQ5567_결혼식 {
	
	private static int friends;
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//동기 수
		friends = in.nextInt();
		
		//리스트의 길이 m
		int relation = in.nextInt();
		
		//결혼식 참석 여부 :  0은 공백, 1은 상근, 나머지 친구들
		boolean[] inviteList = new boolean[friends];
		boolean[][] friendList = new boolean[friends][friends];
		
		//친구관계를 저장할 2차원 int배열
		//int[][] friendsList = new int[relation][2];
		
		//친구관계 입력
		for(int i=0; i<relation; i++) {
			int friend1 = in.nextInt();
			int friend2 = in.nextInt();
			
			friendList[friend1-1][friend2-1] = true;
			friendList[friend2-1][friend1-1] = true;			
		}
		
		System.out.println(solution(friendList, inviteList));
	}
	
	private static int solution(boolean[][] friendList, boolean[] inviteList) {
		//하객수
		int guestCount = 0;
		
		for(int i=1; i<friendList.length; i++) {
			//상근이의 친구가
			if(friendList[0][i]) {
				//아직 초대받지 못했다면 초대
				if(!inviteList[i]) {
					inviteList[i] = true;
					guestCount++;
				}
				for(int j=1; j<friendList.length; j++) {
					//상근이의 친구의 친구가 아직 초대받지 못했다면
					if(friendList[i][j] && !inviteList[j]) {
						inviteList[j] = true;
						guestCount++;
					}
				}
			}
		}
		
		return guestCount;
	}
	//친구의친구의친구까지 된다.
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		//하객 수
//		int answer = 0;
//		
//		//첫째줄 : 상근이의 동기 수 n
//		int friends = in.nextInt();
//		
//		//둘째줄 : 리스트의 길이 m
//		int relationshipNum = in.nextInt();
//		
//		//다음줄부터 m개의 줄에는 친구관계 ai, bi 주어짐
//		//ai와 bi가 친구라는 뜻
//		//상근이 녀석은 뻔뻔하게도 자신의 친구와 친구의 친구를 초대하기로 했다.
//		
//		//친구관계를 저장할 2차원 int배열
//		int[][] relationshipList = new int[relationshipNum][2];
//	
//		//친구의 친구를 찾을 리스트
//		boolean[] inviteList = new boolean[friends]; 
//		
//		for(int i=0; i<relationshipNum; i++) {
//			relationshipList[i][0] = in.nextInt();
//			relationshipList[i][1] = in.nextInt();
//		}
//		
//		for(int i=0; i<relationshipNum; i++) {
//			//상근이의 친구 체크
//			if(relationshipList[i][0] == 1) {
//				inviteList[relationshipList[i][1]] = true;
//			}
//		}
//		
//		for(int i=0; i<inviteList.length; i++) {
//			//친구의 친구 체크
//			if(inviteList[i]){
//				for(int j=0; j<relationshipList.length; j++) {
//					if(relationshipList[j][0] == i) {
//						inviteList[relationshipList[j][1]] = true;
//					}
//				}
//			}
//		} 
//		
//		for(int i=0; i<inviteList.length; i++) {
//			if(inviteList[i]) {
//				answer++;
//			}
//		}
//		System.out.println(answer);		
//	}
}