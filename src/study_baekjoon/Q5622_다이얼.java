package study_baekjoon;

import java.util.Scanner;

public class Q5622_���̾� {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String dial = in.nextLine();
		
		int answer = 0;
		
		for(int i=0; i<dial.length(); i++) {
			//�Ź� ���̾� �ʱ�ȭ
			answer += 2;
			char number = dial.charAt(i);
			
			answer += (number - 'A');
			
		}
	}

}
