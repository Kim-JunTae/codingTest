package study_baekjoon;

import java.util.Scanner;

public class Q10430_������ {

	public static void main(String[] args) {
		//�ð� ���� : ����
		long start = System.currentTimeMillis();
		
		Scanner stdIn = new Scanner(System.in);

		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int C = stdIn.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
		
		//�ð� ���� : ��
		long end = System.currentTimeMillis();
		System.out.println("����ð� : " + (end-start)/1000.0);
	}

}
