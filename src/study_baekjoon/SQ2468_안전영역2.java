package study_baekjoon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class SQ2468_��������2 {

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
	static PriorityQueue<Integer> queue;	//�켱���� ť. ���� ���� �����Ͱ� ���� ������ ť
	
	static int[] dx = {0, 0, -1, 1};	//�� �� �� ��
	static int[] dy = {-1, 1, 0 ,0}; 	//�� �� �� ��
	
	public static void main(String[] args) {
		//�ð� ���� : ����
		long start = System.currentTimeMillis();
		
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		locInfo = new int[N][N];
		queue = new PriorityQueue<>();
		
		//�� �� ���� ��
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
			//���� ���� ������ ������ ������ �亯���� �ʱ�ȭ ��Ų��.
			answer = Math.max(answer, tempAnswer);
		}
		
		//�� ���
		System.out.println(answer);
		
		//�ð� ���� : ��
		long end = System.currentTimeMillis();
		System.out.println("����ð� : " + (end-start)/1000.0);
	}
	
	public static void dfs(int height, int x, int y, boolean[][] visited) {
		visited[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int xx = dx[i] + x;
			int yy = dy[i] + y;
			
			//��ǥ�� �迭�� ������ �Ѿ��� ��, �ǳʶٱ�
			if(xx < 0 || yy < 0 || xx >= N || yy >= N)
				continue;
			//����� ���̰� ���� �纸�� ���� ��, �ǳʶٱ�
			if(locInfo[xx][yy] <= height)
				continue;
			//��Ұ� ħ���� �����̶��, �ǳʶٱ�
			if(visited[xx][yy])
				continue;
			
			//������ �����̶�� �ֺ��� �˻�(DFS)
			dfs(height, xx, yy, visited);
		}
	}
}