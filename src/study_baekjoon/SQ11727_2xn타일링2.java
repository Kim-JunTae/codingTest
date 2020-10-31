package study_baekjoon;

import java.util.Scanner;

public class SQ11727_2xn≈∏¿œ∏µ2 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int[] memo = new int[N+1];
		memo[1] = 1;
		memo[2] = 3;
		
		for(int i=3; i<=N; i++) {
//			int tile1 = memo[i-1];
//			int tile2 = memo[i-2];
//			int tile3 = memo[i-2];	
//			memo[i] = tile1 + tile2 + tile3;
			if(i/2 != 0) {
				memo[i] = memo[i-1]*2 -1;
			}else{//¬¶ºˆ
				memo[i] = memo[i-2]*3;
			}
		}
		
		System.out.println(memo[N]%10007);
	}
	
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		
//		int answer = 1;
//		int temp = 2;
//		
//		while(n > 0) {
//			answer += (pactorial(n)*2)/(pactorial(n-temp)*(temp/2));
//			temp += 2;
//			n -= 2;
//		}
//	
//		System.out.println(answer%10007);
//	}
//	
//	public static int pactorial(int n) {
//		int result = 1;
//		for(int i=n; i>0; i--) {
//			result *= i;
//		}
//		return result;
//	}
}
