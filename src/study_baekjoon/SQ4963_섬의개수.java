package study_baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SQ4963_섬의개수 {
	//상하 좌우
	static int[] xDot = {0, 0, -1, 1};
	static int[] yDot = {1, -1, 0, 0};
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//지도의 너비와 높이
		int w = 0;
		int h = 0;
		
		//답
		List<Integer> answer = new ArrayList<Integer>();
		
		do {
			//첫번째 줄 너비와 높이 입력
			w = in.nextInt();
			h = in.nextInt();
			
			//두번째 줄 지도 생성
 			int[][] map = new int[h][w];
 			boolean[][] visited = new boolean[h][w];
 			
			for(int y=0; y<h; y++) {
				for(int x=0; x<w; x++){
					map[y][x] = in.nextInt();
				}
			}
			
			//섬의 갯수 찾기
			int islandNum = find(map, visited);
			//섬의 갯수 저장
			answer.add(islandNum);
			
		}while(w != 0 && h != 0);//마지막 줄에서 w=0,h=0이 입력될 때 까지 반복
		
		//출력
		for(int i=0; i<answer.size(); i++) {
			System.out.println(answer.get(i));
		}
	}

	private static int find(int[][] map, boolean[][] visited) {
		int islandNum = 0;
		
		for(int y=0; y<map.length; y++) {
			for(int x=0; x<map[0].length; x++) {
				if(!visited[y][x] && map[y][x] == 1){
					dfs(map, x, y, visited);
					islandNum += 1;
				}
			}
		}
		
		return islandNum;
	}

	private static void dfs(int[][] map, int x, int y, boolean[][] visited) {
		visited[y][x] = true;
		
		for(int i=0; i<4; i++) {
			//int dx = 
		}
		
	}
	
	

}
