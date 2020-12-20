package study_baekjoon;

import java.util.Scanner;

public class SQ11403_���ã�� {
	
	static int N;
	static int[][] graph;
	static int[][] answer;
	static boolean[] visit;
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		N = stdin.nextInt();
		
		graph = new int[N][N];
		answer = new int[N][N];
		visit = new boolean[N];
		
		//�׷��� �Է�
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				graph[i][j] = stdin.nextInt();
			}
		}
		
		for(int i=0; i<N; i++) {
			//�湮 �ʱ�ȭ
			for(int j=0; j<N; j++) {
				visit[j] =false;
			}
			
			for(int j=0; j<N; j++) {
				if(graph[i][j] == 1 && visit[j] == false) {
					dfs(i,j);
				}
			}
		}
		
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				System.out.print(answer[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void dfs(int x, int y) {
		visit[y] = true;
		answer[x][y] = 1;
		
		for(int i=0; i<N; i++) {
			if(graph[y][i] == 1 && visit[i] == false) {
				dfs(x, i);
			}
		}
	}//end dfs()
	
}
