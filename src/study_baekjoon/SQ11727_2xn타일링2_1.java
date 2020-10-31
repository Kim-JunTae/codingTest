package study_baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SQ11727_2xn≈∏¿œ∏µ2_1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		if(N==1) {
			System.out.println(1);
		}
		
		if(N==2) {
			System.out.println(3);
		}
		
		int[] memo = new int[N+1];
		memo[1] = 1;
		memo[2] = 3;
		
		for(int i=3; i<=N; i++) {
			int type1 = memo[i-1];
			int type2 = memo[i-2];
			int type3 = memo[i-2];
			memo[i] = (type1 + type2 + type3) % 10007;
		}
		
		System.out.println(memo[N]);
	}

}