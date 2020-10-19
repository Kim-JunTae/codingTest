package study_baekjoon;

import java.util.Scanner;

public class SQ5567_��ȥ�� {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//�ϰ� ��
		int answer = 0;
		
		//ù°�� : ������� ���� �� n
		int friends = in.nextInt();
		
		//��°�� : ����Ʈ�� ���� m
		int relationshipNum = in.nextInt();
		
		//�����ٺ��� m���� �ٿ��� ģ������ ai, bi �־���
		//ai�� bi�� ģ����� ��
		//����� �༮�� �����ϰԵ� �ڽ��� ģ���� ģ���� ģ���� �ʴ��ϱ�� �ߴ�.
		
		//ģ�����踦 ������ 2���� int�迭
		int[][] relationshipList = new int[relationshipNum][2];
	
		//ģ���� ģ���� ã�� ����Ʈ
		boolean[] inviteList = new boolean[friends]; 
		
		for(int i=0; i<relationshipNum; i++) {
			relationshipList[i][0] = in.nextInt();
			relationshipList[i][1] = in.nextInt();
		}
		
		for(int i=0; i<relationshipNum; i++) {
			//������� ģ�� üũ
			if(relationshipList[i][0] == 1) {
				inviteList[relationshipList[i][1]] = true;
			}
		}
		
		for(int i=0; i<inviteList.length; i++) {
			//ģ���� ģ�� üũ
			if(inviteList[i]){
				for(int j=0; j<relationshipList.length; j++) {
					if(relationshipList[j][0] == i) {
						inviteList[relationshipList[j][1]] = true;
					}
				}
			}
		}
		
		for(int i=0; i<inviteList.length; i++) {
			if(inviteList[i]) {
				answer++;
			}
		}
		System.out.println(answer);		
	}
}