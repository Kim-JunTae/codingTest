package study_baekjoon;

import java.util.Scanner;

public class Q2588_곱셈 {

	public static void main(String[] args) {
		//시간 측정 : 시작
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
		//시간 측정 : 끝
		long end = System.currentTimeMillis();
		System.out.println("실행시간 : " + (end-start)/1000.0);
	}

}
