package study_baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수학1_단계 {
	
	//설탕 배달
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String request = br.readLine();		
		int N = Integer.parseInt(request);
		
		int count5kg = 0;	//5kg 봉지 수
		int count3kg = 0;	//3kg 봉지 수
		
		//최소 봉지 갯수
		int minCount;
		
		//최대한 5kg 봉지 수를 확보한다.
		count5kg = N/5;
		N = N-count5kg*5;
		
		while(N%3 != 0) {
			if(count5kg < 0) {
				System.out.println(-1);
				break;
			}
			count5kg -= 1;
			count3kg += 1;
			N += 5;
			
			if(N%3 == 0) {
				System.out.println(count5kg+count3kg);
			}
		}
	}	
	
	//손익 분기점
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
