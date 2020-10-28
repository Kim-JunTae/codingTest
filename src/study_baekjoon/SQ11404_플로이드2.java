package study_baekjoon;

import java.util.Scanner;

//�˰��� : �÷��̵� �ͼ�(����)
public class SQ11404_�÷��̵�2 {
	static int N;
	static int M;
	
	static int[][] maps;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		N = in.nextInt();
		M = in.nextInt();
		
		maps = new int[N+1][N+1];
		
		for(int i=0; i<M; i++) {
			int from = in.nextInt();
			int to = in.nextInt();
			int cost = in.nextInt();
	
			//�Ÿ� �� �ּڰ����� �Է�
			if(maps[from][to] == 0) {
				maps[from][to] = cost;
			}else {
				maps[from][to] = Math.min(cost, maps[from][to]);
			}
		}
		
		in.close();
		
		for(int mid = 1; mid<=N; mid++){
			for(int start=1; start<=N; start++) {
				if(maps[start][mid] == 0)	continue;
				
				for(int end=1; end<=N; end++) {
					if(maps[mid][end] == 0 || start == end)	continue;
					
					//�߰� ��θ� ���İ��� ���� �׳� ���� �� ���� �θ� ����
					if(maps[start][end] == 0 || maps[start][end] > maps[start][mid] + maps[mid][end]) {
						maps[start][end] = maps[start][mid] + maps[mid][end];
					}
				}
			}
		}
		
		for(int x=1; x<=N; x++) {
			for(int y=1; y<=N; y++) {
				System.out.printf("%d ", maps[x][y]);
			}
			System.out.println();
		}
	}
}