package study_baekjoon;

import java.util.Scanner;

public class SQ11403_경로찾기 {
	
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
		
		//그래프 입력
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				graph[i][j] = stdin.nextInt();
			}
		}
		
		for(int i=0; i<N; i++) {
			//방문 초기화
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
