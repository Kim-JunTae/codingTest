package study_baekjoon;

import java.util.Scanner;

public class ���ڿ�_�ܰ� {

	//11720�� ������ ��
	//String -> char -> int ��ȯ
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int N = in.nextInt();
		String numbers = in.next();
		
		for(int i=0; i<N; i++)
			sum += numbers.charAt(i)-'0';
		
		System.out.println(sum);
	}
	
	//11654�� �ƽ�Ű �ڵ�
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
