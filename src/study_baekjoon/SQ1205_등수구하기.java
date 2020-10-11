package study_baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class SQ1205_������ϱ� {

	public static void main(String[] args) {
		//�ð� ���� : ����
		long start = System.currentTimeMillis();

		//�Է�
		//N : ����Ʈ�� �ִ� ������ ����
		//newScore : ���ο� ����
		//P : ��ŷ����Ʈ�� �ö� �� �ִ� ������ ����
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int newScore = stdIn.nextInt();
		int P = stdIn.nextInt();
		
		//��������Ʈ, ��ŷ ����Ʈ
		int[] scoreList = new int[N];
		int[] rankList = new int[P];

		//��°�� �Է�(�� ��������) -> ���� ��ŷ ����Ʈ�� �ִ� ������
		if(N > 0) {
			for(int i=0; i<N; i++) {
				scoreList[i] = stdIn.nextInt();
			}
		}
		
		//��ũ ����Ʈ ��� ����
		//ä������ ���� ������ ��ũ ����Ʈ�� 0���� �ʱ�ȭ
		for(int i=0; i<N; i++) {
			rankList[i] = scoreList[i];
		}
		
		//�������� ����
		//1. �������� ����
		Arrays.sort(rankList);
		//2. ����
		reverse(rankList);
		//-> ex) 100, 90, 80, 0, 0, 0, 0, 0, 0, 0
		
//		for(int i=0; i<P; i++)
//			System.out.print(rankList[i] + " ");
		
		//���ο� ���� rankList�� �ֱ�
		//checkRank(rankList, newScore);
		
		//�˻� �� ���� ���
		int answer = findRank(rankList, newScore);
				
		System.out.println("���� : " + answer);
		
		//�ð� ���� : ��
		long end = System.currentTimeMillis();
		System.out.println("����ð� : " + (end-start)/1000.0);
	}
	
	//��� ã�� �޼���
	public static int findRank(int[] rankList, int newScore) {
		for(int i=0; i<rankList.length; i++) {
			if(rankList[i] < newScore)
				return i;
		}
		return -1;
	}
	
//	//���ο� ���� rankList�� �ֱ�
//	public static void checkRank(int[] rankList, int newScore) {
//		
//		int temp = 0;
//		for(int i=0; i<rankList.length; i++) {
//			temp = rankList[i];
//			if(rankList[i] < newScore) {
//				rankList[i] = newScore;
//			}
//		}
//	}
	
	public static void reverse(int[] a) {
		for(int i=0; i<a.length/2; i++) {
			swap(a, i, a.length-i-1);
		}
	}
	
	public static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

}
