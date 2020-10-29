package study_baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SQ4963_섬의개수 {
	//상하 좌우 대각선들
	static int[] xDot = {0, 0, -1, 1, 1, 1, -1, -1};
	static int[] yDot = {1, -1, 0, 0, 1, -1, 1, -1};
	
	//배열 선언
	static int[][] map;
	static int[][] check;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true){
			int w = in.nextInt();
			int h = in.nextInt();
			
			if(w==0 && h==0)
				break;
			
			map = new int[h][w];
			
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++)
					map[i][j] = in.nextInt();
			}
			
			int count = 0;
			check = new int[h][w];
			
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					if(map[i][j]==1 && check[i][j]==0) {
						dfs(i, j, ++count, w, h);
					}
				}
			}
			
			System.out.println(count);
		}//while문 끝
		in.close();
	}//main 끝

	private static void dfs(int x, int y, int count, int w, int h) {
		check[x][y] = count;
		
		for(int i=0; i<xDot.length; i++) {
			int nx = x + xDot[i];
			int ny = y + yDot[i];
			
			if(0<=nx && nx<h && 0<=ny && ny<w) {
				if(map[nx][ny]==1 && check[nx][ny]==0)
					dfs(nx, ny, count, w, h);
			}
		}
	}
}
