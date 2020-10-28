package study_baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//한 정사각형과 가로, 세로 또는 대각선으로 연결되어 있는 사각형은 걸어갈 수 있는 사각형이다. 
public class SQ4963_섬의개수2 {
	static int[][] arr;
	static int[][] check;
	//아래, 위, 오른쪽, 왼쪽,  오른쪽 대각선 아래, 왼쪽 대각선 위, 오른쪽 대각선 위, 왼쪽 대각선 아래
	static int[] dx = {0, 0, 1, -1, 1, -1, 1, -1};
	static int[] dy = {-1, 1, 0, 0, -1, 1, 1, -1};
	
	// DFS
	private static void dfs(int x, int y, int count, int w, int h) {
		check[x][y] = count;
		
		for(int i=0; i<dx.length; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(0 <= nx && nx < h && 0 <= ny && ny < w) {
				if(arr[nx][ny] == 1 && check[nx][ny] == 0)
					dfs(nx, ny, count, w, h);
			}
		}
	}
	
	//BFS
	public static void bfs(int x, int y, int count, int w, int h) {
		Queue<Pairs> queue = new LinkedList<Pairs>();
		queue.add(new Pairs(x, y));
		check[x][y] = count;
		while(!queue.isEmpty()) {
			Pairs p = queue.remove();
			x = p.x;
			y = p.y;
			for(int i=0; i<dx.length; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if(0 <= nx && nx < h && 0 <= ny && ny < w) {
					if(arr[nx][ny] == 1 && check[nx][ny] == 0)
						bfs(nx, ny, count, w, h);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			int w = in.nextInt();
			int h = in.nextInt();
			
			if(w == 0 && h == 0)
				break;
			
			arr = new int[h][w];
			
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					arr[i][j] = in.nextInt();
				}
			}
			
			int count = 0;
			check = new int[h][w];
			
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					if(arr[i][j] == 1 && check[i][j] == 0) {
						//dfs(i,j,++count,w,h);
						bfs(i,j,++count,w,h);
					}
				}
			}
		}

	}

}

class Pairs{
	int x;
	int y;
	
	Pairs(int x, int y) {
		this.x = x;
		this.y = y;
	}
}