package study_baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class while문_단계 {
	//Q1110번 더하기 사이클
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int original = in.nextInt();
		int number = original;
		int cycle = 0;
		
		do {
			number = number%10*10 + (number/10 + number%10)%10;
			cycle++;
		}while(number != original);
		
		System.out.println(cycle);
	}
	
	//Q10951번 A+B - 4
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		StringTokenizer st;
//		String str;
//		
//		while((str=br.readLine()) != null) {
//			st = new StringTokenizer(str, " ");
//			int A = Integer.parseInt(st.nextToken());
//			int B = Integer.parseInt(st.nextToken());
//			sb.append(A+B).append("\n");
//		}
//		
//		System.out.print(sb);
//	}
	
	//Q10952번 A+B - 5
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int A = 0;
//		int B = 0;
//		do {
//			String text = br.readLine();
//			String[] line = text.split(" ");
//			A = Integer.parseInt(line[0]);
//			B = Integer.parseInt(line[1]);
//			if(A != 0 && B != 0)
//				bw.write(A+B + "\n");
//		}while(A != 0 && B != 0);
//
//		bw.flush();
//		bw.close();
//	}

}
