package study_baekjoon;

import java.util.Scanner;

public class Q1330_�μ����ϱ� {
	//�ð����� 1��
	//�޸����� 512MB
	public static void main(String[] args) {
		//�ð� ���� : ����
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
		
		//�ð� ���� : ��
		long end = System.currentTimeMillis();
		System.out.println("����ð� : " + (end-start)/1000.0);
	}
}