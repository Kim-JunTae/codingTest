package study_baekjoon;

import java.util.Scanner;

public class 문자열_단계 {

	//11720번 숫자의 합
	//String -> char -> int 변환
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int N = in.nextInt();
		String numbers = in.next();
		
		for(int i=0; i<N; i++)
			sum += numbers.charAt(i)-'0';
		
		System.out.println(sum);
	}
	
	//11654번 아스키 코드
	//https://st-lab.tistory.com/59
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		String str = in.next();
//		int answer = str.charAt(0);
//		in.close();
//		System.out.println(answer);
//	}
}
