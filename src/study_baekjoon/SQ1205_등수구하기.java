package study_baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class SQ1205_������ϱ� {
	// ����1,2 ��� -> ���� �Է� 3�� ã��
	// 5 5 5
	// 5 5 4 3 2
	// ��  : 1 but �������� -1
	// ���� ��: if(rankList[i] < newScore && rankList[i+1] > newScore){
	// ���� ��: if(rankList[i] < newScore && rankList[i+1] >= newScore){ rankList[i] = newScore;
	public static void main(String[] args) {
		//�ð� ���� : ����
		long start = System.currentTimeMillis();
		
		int answer = -1;
		
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
		if(N == P){	//��ũ����Ʈ ������� �־��� ���� ����Ʈ ������ ���� ��
			for(int i=0; i<N; i++) {
				rankList[i] = scoreList[i];
			}
			//1. �������� ����
			Arrays.sort(rankList);
			//-> ex) 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
			
			//���ο� ���� �Է�
			for(int i=0; i<N-1; i++) {
				if(rankList[i] < newScore && rankList[i+1] >= newScore){
					//2. ���ο� ���� ���
					rankList[i] = newScore;
					//������ �о��� �����ؾ� �� ���� ������.. �׷��� ���� ���ϴµ����� ������ ���� �� ����.
					
					//3. ���� -> �������� ����
					reverse(rankList);
					//-> ex) 100, 90, 80, 0, 0, 0, 0, 0, 0, 0
					
					//�˻� �� ���
					for(int j=0; j<P; j++) {
						if(rankList[j] == newScore) {
							answer = j+1;
							break;
						}
					}
					break;
				}
			}
			
		}else{//��ũ����Ʈ ������� �־��� ���� ����Ʈ ������ ���� �� 
			for(int i=0; i<N; i++) {
				rankList[i] = scoreList[i];
			}
			//�� ������ ���ο� ���� �Է�
			rankList[N] = newScore;
			
			//�������� ����
			Arrays.sort(rankList);
			//-> ex) newScore�� �� �������� ����
			
			//2. ���� -> �������� ����
			reverse(rankList);
			//-> ex) 100, 90, 80, 0, 0, 0, 0, 0, 0, 0
			
			//�˻� �� ���
			for(int i=0; i<P; i++) {
				if(rankList[i] == newScore) {
					answer = i+1;
					break;
				}
			}
		}
		
		for(int i=0; i<P; i++)
			System.out.print(rankList[i] + " ");
		
		System.out.println("���� : " + answer);
		
		//�ð� ���� : ��
		long end = System.currentTimeMillis();
		System.out.println("����ð� : " + (end-start)/1000.0);
	}

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
