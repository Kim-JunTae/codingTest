package study_baekjoon;

import java.util.Scanner;

public class 함수_단계 {
//	//1065번 한수
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int answer = 0;
		//1부터 N까지 (1000보다 작다)
		for(int i=1; i<=N; i++){
			int number = i;
				
			}
	}

	

	/*
	 *  실패.. 다시 해볼 것
	 */
	//4673번 셀프 넘버
//	public static void main(String[] args) {
//		boolean[] selfNumCheck = new boolean[10000];
//		
//		for(int i=1; i<=10000; i++) {
//			String number = Integer.toString(i);
//			d(number, selfNumCheck);
//		}
//		
//		for(int i=0; i<10000; i++) {
//			if(!selfNumCheck[i]) {
//				System.out.println(selfNumCheck[i]);
//			}
//		}
//	}
//	
//	//각 자리수를 더하는 함수
//	public static void d(String number, boolean[] selfNumCheck) {
//		int notSelfNum = Integer.parseInt(number);
//		
//		for(int i=0; i<number.length(); i++) {
//			notSelfNum += Integer.parseInt(number.substring(i, i+1));
//		}
//		
//		selfNumCheck[notSelfNum-1] = true;
//	}

	
	//15596번 정수 N개의 합_함수구현
//	public long sum(int[] a) {
//		long sum = 0;
//		
//		for(int i=0; i<a.length; i++) {
//			sum += a[i];
//		}
//		
//		return sum;
//	}
	
}
