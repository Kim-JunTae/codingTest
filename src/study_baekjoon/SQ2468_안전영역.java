package study_baekjoon;

import java.util.Scanner;

public class SQ2468_안전영역 {

	static int N = 5;
	static int[][] loc = {{6,8,2,6,2},
						  {3,2,3,4,6},
						  {6,7,3,3,2},
						  {7,2,5,3,6},
						  {8,9,5,2,7}};
	
	public static void main(String[] args) {
		//시간 측정 : 시작
		long start = System.currentTimeMillis();
		
		Scanner stdIn = new Scanner(System.in);
		//어떤 지역의 행과 열의 개수 : 2이상 100이하의 정수 N입력
		int N = stdIn.nextInt();
		//어떤 지역 2차원 배열 및 침수여부 2차원 배열
		int[][] loc = new int[N][N];
		boolean[][] waterLoc;
		
		//어떤 지역의 1이상 100이하의 정수 높이 정보 입력
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				loc[i][j] = stdIn.nextInt();
			}
		}
		//높이 최대 값 찾기
		int maxHeight = findMax(loc);
		
		//비의 양에 따른 안전한 영역의 최대 갯수를 저장하는 변수
		int maxSafeLoc = 0;
		
		//safeLoc 요솟값 넣기
		for(int i=1; i<maxHeight; i++){
			//침수 지역 확인 (false : 침수 X, true : 침수 O)
			waterLoc = new boolean[N][N];
			checkWaterLoc(i, waterLoc, loc);
			int safeLoc = checkSafeLoc(waterLoc, 0, 0);
			if(safeLoc > maxSafeLoc) {
				maxSafeLoc = safeLoc;
			}
		}
		
		//답
		System.out.println(maxSafeLoc);
		
		//시간 측정 : 끝
		long end = System.currentTimeMillis();
		System.out.println("실행시간 : " + (end-start)/1000.0);
	}
	
	public static int checkSafeLoc(boolean[][] waterLoc, int row, int col) {
		int safeLoc = 0;
		
		if(!waterLoc[row][col]){ //침수가 아니라면 킵 무빙
			if(row != waterLoc.length && col != waterLoc.length){
				checkSafeLoc(waterLoc, row, col++);
			}else if(row == waterLoc.length && col == waterLoc.length) {
				
			}else{
				checkSafeLoc(waterLoc, row++, 0);
			}
		}else{	//침수라면
			if(row != waterLoc.length && col != waterLoc.length){
				safeLoc++;
				
				checkSafeLoc(waterLoc, row, col++);
			}else if(row == waterLoc.length && col == waterLoc.length){
				
			}else{
				checkSafeLoc(waterLoc, row++, 0);
			}
		}
	
		return safeLoc;
	}
	
	
	
	public static void checkWaterLoc(int waterAmount, boolean[][] waterLoc, int[][] loc) {
		for(int i=0; i<loc.length; i++) {
			for(int j=0; j<loc.length; j++) {
				if(waterAmount >= loc[i][j])
					waterLoc[i][j] = true;
			}
		}
	}//end checkWaterLoc
	
	public static int findMax(int[][] loc) {
		int max = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(max < loc[i][j])
					max = loc[i][j];
			}
		}
		return max;
	}//end findMax

}
