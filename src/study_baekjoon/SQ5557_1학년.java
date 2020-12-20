package study_baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SQ5557_1�г� {
	public static int N, numbers[];
	public static long calNumbers[][];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//���� ����
		N = in.nextInt();
		//���ڵ�
		numbers = new int[N];
		//����� ����
		calNumbers = new long[N][21];
		
		for(int i=0; i<=N; i++) {
			numbers[i] = in.nextInt();
		}
		//��
		System.out.println(calc());
	}
	
	public static long calc() {
		int i, j, num;
		calNumbers[0][numbers[0]] = 1;
		
		for(i=1; i<N-1; i++) {
			for(j=0; j<=20; j++) {
				//i-1��°������ ���� ������ j�� ���� �� ������
				if(calNumbers[i-1][j] > 0) {
					//������ ���� �� �ִ� �� j�� ���� �� number[i]�� ���ϴ� ���
					num = j + numbers[i];
					
					if(chkCondition(num)) calNumbers[i][num] += calNumbers[i-1][j];
					
					//������ ���� �� �ִ� �� j�� ���� �� number[i]�� ���� ���
					num = j - numbers[i];
					
					if(chkCondition(num)) calNumbers[i][num] += calNumbers[i-1][j];			
				}
			}
		}
		
		return calNumbers[N-2][numbers[N-1]];
	}
	
	private static boolean chkCondition(int n) {
		return 0<=n && n<=20;
	}
	
	/*
	 * public static void main(String[] args) throws IOException{ BufferedReader br
	 * = new BufferedReader(new InputStreamReader(System.in));
	 * 
	 * String totalNumberCount = br.readLine(); int N =
	 * Integer.parseInt(totalNumberCount);
	 * 
	 * String numbers = br.readLine(); String[] tempArray = numbers.split(" ");
	 * int[] numbersArray = new int[N];
	 * 
	 * for(int i=0; i<N; i++) { numbersArray[i] = Integer.parseInt(tempArray[i]); }
	 * 
	 * int answer = 0;
	 * 
	 * answer = findAnswer(answer, numbersArray, 0, 0);
	 * 
	 * System.out.println(answer); }
	 * 
	 * public static int findAnswer(int answer, int[] numbersArray, int sum, int
	 * position) { if(position != numbersArray.length-1) { //+ int temp1 = sum +
	 * numbersArray[position]; if(checkOption(temp1)) { return findAnswer(answer,
	 * numbersArray, temp1, position++); } //- int temp2 = sum -
	 * numbersArray[position]; if(checkOption(temp2)) { return findAnswer(answer,
	 * numbersArray, temp2, position++); } }else{ if(checkOption(sum)) { answer++; }
	 * }
	 * 
	 * return answer; }
	 * 
	 * public static boolean checkOption(int sum) { if(sum < 0 || sum > 20) return
	 * false; return true; }
	 */
}
