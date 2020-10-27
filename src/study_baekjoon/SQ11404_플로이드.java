package study_baekjoon;

import java.util.Scanner;

public class SQ11404_플로이드 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//첫째 줄 : 도시의 갯수 n
		int city = in.nextInt();
		
		//둘째 줄 : 버스의 갯수 m
		int bus = in.nextInt();
		
		//샛째 줄 ~ m+2줄 : 버스의 정보 (출발, 도착, 비용)
		int[][] busInfo = new int[bus][3];
		
		for(int i=0; i<bus; i++) {
			busInfo[i][0] = in.nextInt();
			busInfo[i][1] = in.nextInt();
			busInfo[i][2] = in.nextInt();			
		}
		
		//출력 : n개의 줄, i, j 도시 i에서 j로 가는데 필요한 최소 비용
		//i에서 j로 갈 수 없는 경우 0 출력
		int[][] answer = new int[city][city];
	
		for(int i=0; i<city; i++) {
			int start = busInfo[i][0];
			int end = busInfo[i][1];
			int price = busInfo[i][2];
			//0이 아니고(가는 노선이 있었고) 최소 비용일 때 덮어쓰기
			if(answer[start-1][end-1]!=0 && answer[start-1][end-1] > price)
				answer[start-1][end-1] = price;
		}
		
		//dfs로 중간 경로를 통한 최종 목적지 도착이 가능할 때 비용 구해서 비교하기
		for(int i=0; i<city; i++) {
			for(int j=0; j<city; j++){
				int price = 0;
				answer[i][j] = dfs(i+1, j+1, price, busInfo, answer);
			}
		}
		
		for(int i=0; i<city; i++) {
			for(int j=0; j<city; j++) {
				System.out.print(answer[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int dfs(int start, int end, int price, int[][] busInfo, int[][] answer) {		
		for(int i=0; i<busInfo.length; i++){
			if(busInfo[i][0] == start){
				if(busInfo[i][1] == end) {
					price += busInfo[i][2];
					if(answer[start-1][end-1] == 0 && answer[start-1][end-1] > price) {
						return price;
					}
				}else{
					price += busInfo[i][2];
					if(answer[start-1][end-1] != 0 && price < answer[start-1][end-1])
						dfs(busInfo[i][1], end, price, busInfo, answer);
				}
			}
		}
		
		return 0;
	}

	


}
