package study_baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ����1_�ܰ� {
	
	//���� ���
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		// �ٽ� ����
		
		if(N == 4 || N == 7) {
			System.out.println(-1);
		}else if(N % 5 == 0) {
			System.out.println(N/5);
		}else if(N % 5 == 1 || N % 5 == 3) {
			System.out.println((N/5)+1);
		}else if(N % 5 == 2 || N % 5 == 4) {
			System.out.println((N/5)+2);
		}
	
	}	
	//���� �б���
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String request = br.readLine();
//		String[] firstLine = request.split(" ");
//		
//		int A = Integer.parseInt(firstLine[0]);
//		int B = Integer.parseInt(firstLine[1]);
//		int C = Integer.parseInt(firstLine[2]);
//		
//		if(B>=C) {
//			System.out.println("-1");
//		}else{
//			System.out.println((A/(C-B))+1);
//		}
//	}
}
