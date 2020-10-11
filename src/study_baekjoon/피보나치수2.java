package study_baekjoon;

import java.util.Scanner;

//������ȹ��1 : 2748�� �Ǻ���ġ �� 2 
public class �Ǻ���ġ��2 {
	public static void main(String[] args) {
		//�ð� ���� : ����
		long start = System.currentTimeMillis();
		
		int answer = 0;
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
//		//Memoization
//		int[] fiboNumbers = new int[n+1];
//		fiboNumbers[0] = 0;
//		
//		if(n==0)
//		    answer = fiboNumbers[0];
//        
//        if(n>=1) {
//        	fiboNumbers[1] = 1;
//            answer = fiboNumbers[0]+fiboNumbers[1];
//        }
//        
//        if(n>=2) {
//			answer = fibonacci(n, fiboNumbers);
//        }
		
		answer = fibo(n);
        
		System.out.println(answer);
		//�ð� ���� : ��
		long end = System.currentTimeMillis();
		System.out.println("����ð� : " + (end-start)/1000.0);
	}
	
	public static int fibo(int n) {
		if(n==0)
			return 0;
		else if(n == 1)
			return 1;
		else
			return fibo(n-1)+fibo(n-2);
	}
	
//	public static int fibonacci(int n, int[] fiboNumbers) {
//		int result = fiboNumbers[0]+fiboNumbers[1];
//		
//		for(int i=2; i<=n; i++){
//			fiboNumbers[i] = fiboNumbers[i-1]+fiboNumbers[i-2];
//			result = fiboNumbers[i];
//		}
//		
//		return result;
//	}
}
