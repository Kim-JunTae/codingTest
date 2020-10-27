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
		int[][] answer = new int[city][city];
	
		for(int i=0; i<city; i++) {
			int start = busInfo[i][0];
			int end = busInfo[i][1];
			int price = busInfo[i][2];
			//0�� �ƴϰ�(���� �뼱�� �־���) �ּ� ����� �� �����
			if(answer[start-1][end-1]!=0 && answer[start-1][end-1] > price)
				answer[start-1][end-1] = price;
		}
		
		//dfs�� �߰� ��θ� ���� ���� ������ ������ ������ �� ��� ���ؼ� ���ϱ�
		for(int i=0; i<city; i++) {
			for(int j=0; j<city; j++){
				int price = 0;
				answer[i][j] = dfs(i+1, j+1, price, busInfo, answer);
			}
		}
		
		for(int i=0; i<city; i++) {
			for(int j=0; j<city; j++) {
				System.out.print(answer[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int dfs(int start, int end, int price, int[][] busInfo, int[][] answer) {		
		for(int i=0; i<busInfo.length; i++){
			if(busInfo[i][0] == start){
				if(busInfo[i][1] == end) {
					price += busInfo[i][2];
					if(answer[start-1][end-1] == 0 && answer[start-1][end-1] > price) {
						return price;
					}
				}else{
					price += busInfo[i][2];
					if(answer[start-1][end-1] != 0 && price < answer[start-1][end-1])
						dfs(busInfo[i][1], end, price, busInfo, answer);
				}
			}
		}
		
		return 0;
	}

	


}
