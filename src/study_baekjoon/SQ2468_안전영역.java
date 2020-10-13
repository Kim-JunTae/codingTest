package study_baekjoon;

import java.util.Scanner;

public class SQ2468_�������� {

	static int N = 5;
	static int[][] loc = {{6,8,2,6,2},
						  {3,2,3,4,6},
						  {6,7,3,3,2},
						  {7,2,5,3,6},
						  {8,9,5,2,7}};
	
	public static void main(String[] args) {
		//�ð� ���� : ����
		long start = System.currentTimeMillis();
		
		Scanner stdIn = new Scanner(System.in);
		//� ������ ��� ���� ���� : 2�̻� 100������ ���� N�Է�
		int N = stdIn.nextInt();
		//� ���� 2���� �迭 �� ħ������ 2���� �迭
		int[][] loc = new int[N][N];
		boolean[][] waterLoc;
		
		//� ������ 1�̻� 100������ ���� ���� ���� �Է�
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				loc[i][j] = stdIn.nextInt();
			}
		}
		//���� �ִ� �� ã��
		int maxHeight = findMax(loc);
		
		//���� �翡 ���� ������ ������ �ִ� ������ �����ϴ� ����
		int maxSafeLoc = 0;
		
		//safeLoc ��ڰ� �ֱ�
		for(int i=1; i<maxHeight; i++){
			//ħ�� ���� Ȯ�� (false : ħ�� X, true : ħ�� O)
			waterLoc = new boolean[N][N];
			checkWaterLoc(i, waterLoc, loc);
			int safeLoc = checkSafeLoc(waterLoc, 0, 0);
			if(safeLoc > maxSafeLoc) {
				maxSafeLoc = safeLoc;
			}
		}
		
		//��
		System.out.println(maxSafeLoc);
		
		//�ð� ���� : ��
		long end = System.currentTimeMillis();
		System.out.println("����ð� : " + (end-start)/1000.0);
	}
	
	public static int checkSafeLoc(boolean[][] waterLoc, int row, int col) {
		int safeLoc = 0;
		
		if(!waterLoc[row][col]){ //ħ���� �ƴ϶�� ŵ ����
			if(row != waterLoc.length && col != waterLoc.length){
				checkSafeLoc(waterLoc, row, col++);
			}else if(row == waterLoc.length && col == waterLoc.length) {
				
			}else{
				checkSafeLoc(waterLoc, row++, 0);
			}
		}else{	//ħ�����
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
