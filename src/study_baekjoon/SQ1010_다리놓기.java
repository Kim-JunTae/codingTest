package study_baekjoon;

import java.util.Scanner;

public class SQ1010_�ٸ����� {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		//int�� �ϴ� ���ڰ� Ŀ���� ���� 0�̵Ǽ� ���´�.
		double[] answer = new double[T];
		
		for(int i=0; i<T; i++) {
			int N = in.nextInt();
			int M = in.nextInt();
		
			if(N == M)
				answer[i] = 1;
			else{
				answer[i] = factorial(M)/(factorial(M-N)*factorial(N));
			}
		}
		
		for(int i=0; i<T; i++) {
			System.out.printf("%.0f%n",answer[i]);
		}
	}

	public static double factorial(double n) {
		double result = 1;
		while(n>1) {
			result *= n;
			n--;
		}
		return result;
	}
}
