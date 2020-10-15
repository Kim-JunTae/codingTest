package study_baekjoon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class SQ2468_안전영역2 {

	static int N;
	static int[][] locInfo;
	
//	static int N = 5;
//	static int[][] locInfo = {{6,8,2,6,2},
//						  	  {3,2,3,4,6},
//						      {6,7,3,3,2},
//						      {7,2,5,3,6},
//						      {8,9,5,2,7}};
	
	// ?
	static int min = Integer.MAX_VALUE;
	static int max = Integer.MIN_VALUE;
	
	static int answer = 0;
	static PriorityQueue<Integer> queue;	//우선순위 큐. 가장 높은 데이터가 먼저 나오는 큐
	
	static int[] dx = {0, 0, -1, 1};	//상 하 좌 우
	static int[] dy = {-1, 1, 0 ,0}; 	//상 하 좌 우
	
	public static void main(String[] args) {
		//시간 측정 : 시작
		long start = System.currentTimeMillis();
		
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		locInfo = new int[N][N];
		queue = new PriorityQueue<>();
		
		//비가 안 왔을 때
		queue.offer(0);
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				locInfo[i][j] = in.nextInt();
				if(!queue.contains(locInfo[i][j]))
					queue.offer(locInfo[i][j]);
			}
		}
		
		while(!queue.isEmpty()) {
			int height = queue.poll();
			
			boolean[][] visited = new boolean[N][N];
			int tempAnswer = 0;
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(!visited[i][j] && locInfo[i][j] > height) {
						dfs(height, i, j, visited);
						tempAnswer += 1;
					}
				}
			}
			//가장 높은 안전한 영역의 갯수를 답변으로 초기화 시킨다.
			answer = Math.max(answer, tempAnswer);
		}
		
		//답 출력
		System.out.println(answer);
		
		//시간 측정 : 끝
		long end = System.currentTimeMillis();
		System.out.println("실행시간 : " + (end-start)/1000.0);
	}
	
	public static void dfs(int height, int x, int y, boolean[][] visited) {
		visited[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int xx = dx[i] + x;
			int yy = dy[i] + y;
			
			//좌표가 배열의 범위를 넘었을 때, 건너뛰기
			if(xx < 0 || yy < 0 || xx >= N || yy >= N)
				continue;
			//장소의 높이가 비의 양보다 낮을 때, 건너뛰기
			if(locInfo[xx][yy] <= height)
				continue;
			//장소가 침수된 지역이라면, 건너뛰기
			if(visited[xx][yy])
				continue;
			
			//안전한 지역이라면 주변을 검사(DFS)
			dfs(height, xx, yy, visited);
		}
	}
}