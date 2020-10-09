package study_baekjoon;

import java.util.Scanner;

public class ��ܿ�����3 {

	static Integer total[];
	static int stairs[];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//����� ���� �Է�
		int N = in.nextInt();
		//�� ����� ������ ���� �迭
		stairs = new int[N+1];
		//�� ����� ���� �Է�
		for(int i=1; i<=N; i++) {
			stairs[i] = in.nextInt();
		}
		
		//����� ������ ���� �ִ��� ���� �迭, ������ȹ��(Dynamic Programming)
		total = new Integer[N+1];
		
		
		total[0] = stairs[0];	//����Ʈ ���� null�̹Ƿ� 0���� �ʱ�ȭ
		total[1] = stairs[1];
		
		if(N>=2) {
			total[2] = stairs[1] + stairs[2];
		}
		
		System.out.println(find(N));
	}
	
	static int find(int N) {
		//���� Ž������ ���� N���� ����� ���
		if(total[N] == null) {
			total[N] = Math.max(find(N-2), find(N-3)+stairs[N-1]) + stairs[N];
		}
		
		return total[N];
	}

}
