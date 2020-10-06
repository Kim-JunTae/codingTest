package study_baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class �丶��2 {
	
	static int N;
	static int M;
	static int[][] box;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	
	static class Tomato {
		int x;
		int y;
		int day;
		
		public Tomato(int x, int y, int day) {
			this.x = x;
			this.y = y;
			this.day  = day;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		M = in.nextInt();
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				box[i][j] = in.nextInt();
			}
		}
		
		bfs();
	}
	
	static void bfs() {
		Queue<Tomato> q = new LinkedList<>();
		int day = 0;
		//�丶�� �ִ� ��ǥ ã�Ƽ� Queue�� �ֱ�
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(box[i][j] == 1)
					q.offer(new Tomato(i, j, 0));
			}
		}
		
		//bfs ����
		while(!q.isEmpty()) {
			Tomato tomato = q.poll();
			day = tomato.day;
			
			for(int i=0; i<4; i++) {
				int nx = tomato.x + dx[i];
				int ny = tomato.y + dy[i];
				
				if(0 <= nx && nx < M && 0 <= ny && ny < N) {
					if(box[nx][ny] == 0) {
						box[nx][ny] = 1;
						q.add(new Tomato(nx, ny, day+1));
					}
				}
			}
		}
		
		//�丶�� �� �;����� Ȯ��
		if(checkTomato())
			System.out.println(day);
		else
			System.out.println(-1);
	}
	
	static boolean checkTomato() {
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(box[i][j] == 0)
					return false;
			}
		}
		return true;
	}
}
