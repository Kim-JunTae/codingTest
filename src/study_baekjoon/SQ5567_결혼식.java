package study_baekjoon;

import java.util.Scanner;

public class SQ5567_��ȥ�� {
	
	private static int friends;
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//���� ��
		friends = in.nextInt();
		
		//����Ʈ�� ���� m
		int relation = in.nextInt();
		
		//��ȥ�� ���� ���� :  0�� ����, 1�� ���, ������ ģ����
		boolean[] inviteList = new boolean[friends];
		boolean[][] friendList = new boolean[friends][friends];
		
		//ģ�����踦 ������ 2���� int�迭
		//int[][] friendsList = new int[relation][2];
		
		//ģ������ �Է�
		for(int i=0; i<relation; i++) {
			int friend1 = in.nextInt();
			int friend2 = in.nextInt();
			
			friendList[friend1-1][friend2-1] = true;
			friendList[friend2-1][friend1-1] = true;			
		}
		
		System.out.println(solution(friendList, inviteList));
	}
	
	private static int solution(boolean[][] friendList, boolean[] inviteList) {
		//�ϰ���
		int guestCount = 0;
		
		for(int i=1; i<friendList.length; i++) {
			//������� ģ����
			if(friendList[0][i]) {
				//���� �ʴ���� ���ߴٸ� �ʴ�
				if(!inviteList[i]) {
					inviteList[i] = true;
					guestCount++;
				}
				for(int j=1; j<friendList.length; j++) {
					//������� ģ���� ģ���� ���� �ʴ���� ���ߴٸ�
					if(friendList[i][j] && !inviteList[j]) {
						inviteList[j] = true;
						guestCount++;
					}
				}
			}
		}
		
		return guestCount;
	}
	//ģ����ģ����ģ������ �ȴ�.
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		//�ϰ� ��
//		int answer = 0;
//		
//		//ù°�� : ������� ���� �� n
//		int friends = in.nextInt();
//		
//		//��°�� : ����Ʈ�� ���� m
//		int relationshipNum = in.nextInt();
//		
//		//�����ٺ��� m���� �ٿ��� ģ������ ai, bi �־���
//		//ai�� bi�� ģ����� ��
//		//����� �༮�� �����ϰԵ� �ڽ��� ģ���� ģ���� ģ���� �ʴ��ϱ�� �ߴ�.
//		
//		//ģ�����踦 ������ 2���� int�迭
//		int[][] relationshipList = new int[relationshipNum][2];
//	
//		//ģ���� ģ���� ã�� ����Ʈ
//		boolean[] inviteList = new boolean[friends]; 
//		
//		for(int i=0; i<relationshipNum; i++) {
//			relationshipList[i][0] = in.nextInt();
//			relationshipList[i][1] = in.nextInt();
//		}
//		
//		for(int i=0; i<relationshipNum; i++) {
//			//������� ģ�� üũ
//			if(relationshipList[i][0] == 1) {
//				inviteList[relationshipList[i][1]] = true;
//			}
//		}
//		
//		for(int i=0; i<inviteList.length; i++) {
//			//ģ���� ģ�� üũ
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