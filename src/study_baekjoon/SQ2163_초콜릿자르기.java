package study_baekjoon;

import java.util.Scanner;

public class SQ2163_���ݸ��ڸ��� {
	static int N = 300;
	static int M = 300;
	
	public static void main(String[] args) {
		//�ð� ���� : ����
		long start = System.currentTimeMillis();
				
		//int answer = 0;
		//Scanner stdIn = new Scanner(System.in);
		//int M = stdIn.nextInt();	
		//answer = N*M-1;
		
		System.out.println(N*M-1);	
		
		//�ð� ���� : ��
		long end = System.currentTimeMillis();
		System.out.println("����ð� : " + (end-start)/1000.0);
	}
}