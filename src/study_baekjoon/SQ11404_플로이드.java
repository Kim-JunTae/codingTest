package study_baekjoon;

import java.util.Scanner;

public class SQ11404_�÷��̵� {
	static int N, M;
	
	static int[][] maps;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		M = in.nextInt();
		
		maps = new int[N+1][N+1];
		
		for(int i=0; i<M; i++) {
			int start = in.nextInt();
			int end = in.nextInt();
			int price = in.nextInt();
			
			//�ּڰ� �Է�
			if(maps[start][end] == 0)
				maps[start][end] = price;
			else
				maps[start][end] = Math.min(maps[start][end], price);
		}
		
		in.close();
		
		//�÷��̵� �ͼ�? ����?
		for(int mid=1; mid<=N; mid++) {
			for(int start=1; start<=N; start++) {
				if(maps[start][mid] == 0)
					continue;
				
				for(int end=1; end<=N; end++) {
					if(maps[mid][end] == 0 || start == end)
						continue;
					
					if(maps[start][end] == 0 || maps[start][end] > maps[start][mid] + maps[mid][end]) {
						maps[start][end] = maps[start][mid] + maps[mid][end];
					}
				}
			}
		}
		
		for(int x=1; x<=N; x++) {
			for(int y=1; y<=N; y++) {
				//System.out.println(maps[x][y]);
				System.out.printf("%d ", maps[x][y]);
			}
			System.out.println();
		}
	}
	
	
	//�Է� �迭���� ���� ���� ���̰� �������.
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		//ù° �� : ������ ���� n
//		int city = in.nextInt();
//		
//		//��° �� : ������ ���� m
//		int bus = in.nextInt();
//		
//		//��° �� ~ m+2�� : ������ ���� (���, ����, ���)
//		int[][] busInfo = new int[bus][3];
//		
//		for(int i=0; i<bus; i++) {
//			busInfo[i][0] = in.nextInt();
//			busInfo[i][1] = in.nextInt();
//			busInfo[i][2] = in.nextInt();			
//		}
//		
//		//��� : n���� ��, i, j ���� i���� j�� ���µ� �ʿ��� �ּ� ���
//		//i���� j�� �� �� ���� ��� 0 ���
//		int[][] cost = new int[city][city];
//	
//		for(int i=0; i<city; i++) {
//			int start = busInfo[i][0];
//			int end = busInfo[i][1];
//			int price = busInfo[i][2];
//			for(int j=0; j<city; j++) {
//				//���۰� �� ������ 0 ó��
//				if(i==j)
//					cost[i][j] = 0;
//				//��ΰ� ��ġ�ϰ�, ����� �� ���� �� �����
//				if(j==end && cost[i][j] > price)
//					cost[i][j] = price;
//			}
//		}
	
//		//�÷��̵� : �߰� ������ ������ ��?
//		for(int start=0; start<city; start++) {
//			for(int mid=0; mid<city; mid++) {
//				for(int end=0; end<city; end++){
//					
//				}
//			}
//		}
//		
//		//���
//		for(int i=0; i<city; i++) {
//			for(int j=0; j<city; j++) {
//				System.out.println(cost[i][j]);
//			}
//		}
//	}

}
