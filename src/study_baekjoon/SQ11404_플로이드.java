package study_baekjoon;

import java.util.Scanner;

public class SQ11404_�÷��̵� {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//ù° �� : ������ ���� n
		int city = in.nextInt();
		
		//��° �� : ������ ���� m
		int bus = in.nextInt();
		
		//��° �� ~ m+2�� : ������ ���� (���, ����, ���)
		int[][] busInfo = new int[bus][3];
		
		for(int i=0; i<bus; i++) {
			busInfo[i][0] = in.nextInt();
			busInfo[i][1] = in.nextInt();
			busInfo[i][2] = in.nextInt();			
		}
		
		//��� : n���� ��, i, j ���� i���� j�� ���µ� �ʿ��� �ּ� ���
		//i���� j�� �� �� ���� ��� 0 ���
		int[][] cost = new int[city][city];
	
		for(int i=0; i<city; i++) {
			int start = busInfo[i][0];
			int end = busInfo[i][1];
			int price = busInfo[i][2];
			for(int j=0; j<city; j++) {
				//���۰� �� ������ 0 ó��
				if(i==j)
					cost[i][j] = 0;
				//��ΰ� ��ġ�ϰ�, ����� �� ���� �� �����
				if(j==end && cost[i][j] > price)
					cost[i][j] = price;
			}
		}
		//�÷��̵� : �߰� ������ ������ ��?
		for(int start=0; start<city; start++) {
			for(int mid=0; mid<city; mid++) {
				for(int end=0; end<city; end++){
					
				}
			}
		}
		
		//���
		for(int i=0; i<city; i++) {
			for(int j=0; j<city; j++) {
				System.out.println(cost[i][j]);
			}
		}
	}

}
