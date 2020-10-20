package study_baekjoon;

import java.util.Scanner;

public class 일차원배열_단계 {
	
	//Q2562 최댓값
	public static void main(String[] args) {
		int[] list = new int[9];
		
		Scanner in = new Scanner(System.in);
		int max = 0;
		for(int i=0; i<9; i++) {
			list[i] = in.nextInt();
			if(list[i] > max)
				max = list[i];
		}
		
		for(int i=0; i<9; i++) {
			if(list[i] == max) {
				System.out.println(list[i]);
				System.out.println(i+1);
				break;
			}
		}
	}
	
	
	//Q10818번 최소, 최대
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		int min = 0;
//		int max = 0;
//		
//		int N = in.nextInt();
//		
//		int number = in.nextInt();
//		max = number;
//		min = number;
//		
//		for(int i=0; i<N-1; i++) {
//			number = in.nextInt();
//			if(number > max)
//				max = number;
//			if(number < min)
//				min = number;
//		}
//		
//		System.out.println(min + " " + max);
//	}
}
