package study_baekjoon;

import java.util.Scanner;

public class SQ9251_LCS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//���ڿ� : ���ĺ� �빮��, �ִ� 1000����
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		
		//�ڿ� ����
		//in.close();
		
		//LCS�� ���� ǥ
		int[][] LCS = new int[str1.length()+1][str2.length()+1];
		
		for(int x=1; x<=str1.length(); x++) {
			
			char c1 = str1.charAt(x-1);
			
			for(int y=1; y<=str2.length(); y++) {
				char c2 = str2.charAt(y-1);
				
				//���� ���ٸ� ���� �밢�� ���� ��+1
				if(c1 == c2) {
					LCS[x][y] = LCS[x-1][y-1]+1;
				}else{//���� �ٸ��ٸ� ����(x-1), ����� ��(y-1)�� �� ū��
					LCS[x][y] = Math.max(LCS[x-1][y], LCS[x][y-1]);
				}
			}
		}
		
		System.out.println(LCS[str1.length()][str2.length()]);
	}
}
