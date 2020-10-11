package study_baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class �丶�� {
	
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
		//�ð� ���� : ����
		long start = System.currentTimeMillis();
		
//		int day = -1;
//		//���� 1~5������ �� ����
//		int N = 2;
//		int M = 2;	
//		
//		int[][] todayTomato = {{1,-1},
//							   {-1,1}};
//		
//		int[][] tomorrowTomato = new int[M][N];	
		
		while(!Arrays.deepEquals(todayTomato, tomorrowTomato)) {
			//ù���� ������ ������ �丶�� ������Ʈ : 2���� �迭 ���� ����
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
			//clone�� X
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
			
			//�Ϸ簡 ������.
			day++;
			//���� �丶�� �����¿� �ͰԵȴ�.
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
		
		//���� �丶�� �迭 �˻�
		int chk = 0;
		
		exit_For:	//���̺� ����
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(todayTomato[i][j] == 0) {
					chk = -1;
					break exit_For;
				}
			}
		}
		
		if(chk == -1) {
			System.out.println("�� : " + -1);
		}else{
			if(day == 0)
				System.out.println("�� : "+0);
			else
				System.out.println("�� : "+day);
		}
		
		//�ð� ���� : ��
		long end = System.currentTimeMillis();
		System.out.println("����ð� : " + (end-start)/1000.0);
	}
}
