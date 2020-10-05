package study_baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class �丶�� {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int M = in.nextInt();
//		int N = in.nextInt();
//		
//		int day = -1;
//		
//		int[][] todayTomato = new int[M][N];
//		int[][] tomorrowTomato = new int[M][N];

//		for(int i=0; i<M; i++) {
//			for(int j=0; j<N; j++){
//				todayTomato[i][j] = in.nextInt();
//			}
//		}
		int day = -1;
		int M = 4;
		int N = 6;
			
		int[][] todayTomato = {{0,0,0,0,0,0},
					   		   {0,0,0,0,0,0},
					   		   {0,0,0,0,0,0},
					   		   {0,0,0,0,0,1}};
		
		int[][] tomorrowTomato = new int[6][4];	
		
		while(Arrays.deepEquals(todayTomato, tomorrowTomato)) {
			//������ �丶��
			todayTomato = tomorrowTomato.clone();
			//�Ϸ簡 ������.
			day++;
			//���� �丶�� �����¿� �ͰԵȴ�.
			for(int i=0; i<M; i++) {
				for(int j=0; j<N; j++){
					if(todayTomato[i][j] == 1) {
						if(tomorrowTomato[i-1][j] != -1)
							tomorrowTomato[i-1][j] = 1;
						
						if(tomorrowTomato[i][j-1] != -1)
							tomorrowTomato[i][j-1] = 1;
						
						if(tomorrowTomato[i+1][j] != -1)
							tomorrowTomato[i+1][j] = 1;
						
						if(tomorrowTomato[i][j+1] != -1)
							tomorrowTomato[i][j+1] = 1;
					}
				}
			}
			System.out.println();
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
			System.out.println(-1);
		}else{
			if(day == 0)
				System.out.println(0);
			else
				System.out.println(day);
		}
		
	}
}
