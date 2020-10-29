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
		int[][] cost = new int[city][city];
	
		for(int i=0; i<city; i++) {
			int start = busInfo[i][0];
			int end = busInfo[i][1];
			int price = busInfo[i][2];
			for(int j=0; j<city; j++) {
				//시작과 끝 같은건 0 처리
				if(i==j)
					cost[i][j] = 0;
				//경로가 일치하고, 비용이 더 작을 때 덮어쓰기
				if(j==end && cost[i][j] > price)
					cost[i][j] = price;
			}
		}
		//플로이드 : 중간 경유지 거쳤을 때?
		for(int start=0; start<city; start++) {
			for(int mid=0; mid<city; mid++) {
				for(int end=0; end<city; end++){
					
				}
			}
		}
		
		//출력
		for(int i=0; i<city; i++) {
			for(int j=0; j<city; j++) {
				System.out.println(cost[i][j]);
			}
		}
	}

}
