package study_baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class For문_단계 {
	//Q10871번 X보다 작은 수
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String text1 = br.readLine();
		String[] firstLine = text1.split(" ");

		String text2 = br.readLine();
		String[] secondLine = text2.split(" ");
		
		int N = Integer.parseInt(firstLine[0]);
		int X = Integer.parseInt(firstLine[1]);
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++)
			if(Integer.parseInt(secondLine[i]) < X)
				bw.write(secondLine[i] + " ");
		
		bw.flush();
		bw.close();
	}
	
	//Q2439번 별 찍기 - 2
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int T = Integer.parseInt(br.readLine());
//		
//		for(int i=0; i<T; i++) {
//			for(int k=0; k<T-i-1; k++)
//				bw.write(" ");
//			for(int j=0; j<i+1; j++)
//				bw.write("*");
//			bw.write("\n");
//		}
//		
//		bw.flush();
//		bw.close();
//	}
	
	//Q2438번 별 찍기
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int T = Integer.parseInt(br.readLine());
//		
//		for(int i=0; i<T; i++) {
//			for(int j=0; j<i+1; j++)
//				bw.write("*");
//			bw.write("\n");
//		}
//		
//		bw.flush();
//		bw.close();
//	}
	
	//Q11022번 A+B -8
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int T = Integer.parseInt(br.readLine());
//
//		for(int i=0; i<T; i++) {
//			String text = br.readLine();
//			String[] word = text.split(" ");
//			int A = Integer.parseInt(word[0]);
//			int B = Integer.parseInt(word[1]);
//			bw.write("Case #"+(i+1)+": "+A+" + "+B+" = "+(A+B)+ "\n");
//		}
//		
//		bw.flush();
//		bw.close();
//	}
	
	//Q11021번 A+B -7
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int T = Integer.parseInt(br.readLine());
//
//		for(int i=0; i<T; i++) {
//			String text = br.readLine();
//			String[] word = text.split(" ");
//			int A = Integer.parseInt(word[0]);
//			int B = Integer.parseInt(word[1]);
//			bw.write("Case #"+(i+1)+": "+(A+B)+ "\n");
//		}
//		
//		bw.flush();
//		bw.close();
//	}
	
	//Q2742번 기찍 N
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int N = Integer.parseInt(br.readLine());
//		
//		for(int i=N; i>0; i--)
//			System.out.println(i);
//		
//		bw.flush();
//		bw.close();
//	}
	
	//Q2741번 N 찍기
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int N = Integer.parseInt(br.readLine());
//		
//		for(int i=1; i<N+1; i++)
//			System.out.println(i);
//	
//		bw.flush();
//		bw.close();
//	}
	
	//Q15552번 빠른 A+B
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int n = Integer.parseInt(br.readLine().trim());
//		
//		for(int i=0; i<n; i++) {
//			String text = br.readLine();
//			String[] word = text.split(" ");
//			int a = Integer.parseInt(word[0]);
//			int b = Integer.parseInt(word[1]);
//			bw.write((a+b) + "\n");
//		}
//		
//		bw.flush();
//		bw.close();
//	}
}
