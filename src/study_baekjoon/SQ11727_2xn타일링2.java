package study_baekjoon;

import java.util.Scanner;

public class SQ11727_2xnÅ¸ÀÏ¸µ2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int answer = 1;
		int temp = 2;
		
		while(n > 0) {
			answer += (pactorial(n)*2)/(pactorial(n-temp)*(temp/2));
			temp += 2;
			n -= 2;
		}
	
		System.out.println(answer%10007);
	}
	
	public static int pactorial(int n) {
		int result = 1;
		for(int i=n; i>0; i--) {
			result *= i;
		}
		return result;
	}
}
