package study_baekjoon;

import java.util.Scanner;

public class Q1000_A���ϱ�B {

	public static void main(String[] args) {
		//�ð� ���� : ����
		long start = System.currentTimeMillis();
		
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		
		
		System.out.println(A+B);
		//�ð� ���� : ��
		long end = System.currentTimeMillis();
		System.out.println("����ð� : " + (end-start)/1000.0);
	}

}
