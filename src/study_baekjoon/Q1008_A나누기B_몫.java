package study_baekjoon;

import java.util.Scanner;

public class Q1008_A������B_�� {
	public static void main(String[] args) {
		//�ð� ���� : ����
		long start = System.currentTimeMillis();
		
		Scanner stdIn = new Scanner(System.in);
		Double A = stdIn.nextDouble();
		Double B = stdIn.nextDouble();
		
		System.out.println(A/B);
		//�ð� ���� : ��
		long end = System.currentTimeMillis();
		System.out.println("����ð� : " + (end-start)/1000.0);
	}
}