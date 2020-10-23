package study_baekjoon;

import java.util.Scanner;

public class SQ9251_LCS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//문자열 : 알파벳 대문자, 최대 1000글자
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		
		//자원 해제
		//in.close();
		
		//LCS를 구할 표
		int[][] LCS = new int[str1.length()+1][str2.length()+1];
		
		for(int x=1; x<=str1.length(); x++) {
			
			char c1 = str1.charAt(x-1);
			
			for(int y=1; y<=str2.length(); y++) {
				char c2 = str2.charAt(y-1);
				
				//값이 같다면 좌측 대각선 위의 값+1
				if(c1 == c2) {
					LCS[x][y] = LCS[x-1][y-1]+1;
				}else{//값이 다르다면 좌측(x-1), 상단의 값(y-1)중 더 큰값
					LCS[x][y] = Math.max(LCS[x-1][y], LCS[x][y-1]);
				}
			}
		}
		
		System.out.println(LCS[str1.length()][str2.length()]);
	}
}
