package study_baekjoon;

import java.util.Scanner;

public class Q1330_두수비교하기 {
	//시간제한 1초
	//메모리제한 512MB
	public static void main(String[] args) {
		//시간 측정 : 시작
		long start = System.currentTimeMillis();
		
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		
		if(A > B) {
			System.out.println(">");
		}else if(A < B){
			System.out.println("<");
		}else{
			System.out.println("==");
		}
		
		//시간 측정 : 끝
		long end = System.currentTimeMillis();
		System.out.println("실행시간 : " + (end-start)/1000.0);
	}
}