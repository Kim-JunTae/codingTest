package study_baekjoon;

import java.util.Scanner;

public class Q2588_���� {

	public static void main(String[] args) {
		//�ð� ���� : ����
		long start = System.currentTimeMillis();
		
		Scanner stdIn = new Scanner(System.in);

		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		
		String b = String.valueOf(B);
		int[] bList = new int[b.length()];
		int index = 0;
		int sum = 0;
		for(int i=b.length(); i>0; i--) {
			bList[index] = Integer.parseInt(b.substring(i-1, i));
			System.out.println(A*bList[index]);
			sum += A*bList[index]*Math.pow(10, index);
			index++;
		}
		
		System.out.println(sum);
		
		System.out.println();
		//�ð� ���� : ��
		long end = System.currentTimeMillis();
		System.out.println("����ð� : " + (end-start)/1000.0);
	}

}
