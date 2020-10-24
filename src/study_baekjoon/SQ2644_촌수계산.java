package study_baekjoon;

import java.util.Scanner;

public class SQ2644_�̼���� {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//ù° �� : ��ü ����� �� n
		int totalPeopleNum = in.nextInt();
		
		//��° �� : �̼��� ����ؾ� �ϴ� ���� �ٸ� �λ���� ��ȣ
		int peopleOne = in.nextInt();
		int peopleTwo = in.nextInt();
		
		//��° �� : �θ� �ڽĵ� ���� ������ ���� m
		int m = in.nextInt();
		
		//int[][] kinship = new int[relationNum][2];
		//boolean[][] kinship = new boolean[totalPeopleNum][totalPeopleNum];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		//������ ���� ��ŭ �Է�
		//x�� y�� �θ��̴�.
		for(int i=0; i<m; i++) {
			int value = in.nextInt(); 	//�θ�
			int key = in.nextInt();		//�ڽ�
			map.put(key, value);
		}
		
		//�ѻ���� ���赵 �׸���
		List<Integer> oneKinship = new ArrayList<Integer>();
		List<Integer> twoKinship = new ArrayList<Integer>();
		
		oneKinship.add(peopleOne);
		twoKinship.add(peopleTwo);
		for(int i=1; i<=m; i++) {
			Integer parent = map.get(peopleOne);
			if(parent == null) {
				break;
			}else{
				oneKinship.add(parent);
				peopleOne = parent;
			}
		}
		
		for(int i=1; i<=m; i++) {
			Integer parent = map.get(peopleTwo);
			if(parent == null) {
				break;
			}else{
				twoKinship.add(parent);
				peopleTwo = parent;
			}
		}
		
		//�̼� ���ϱ�
		int count = -1;
		for(int i=0; i<oneKinship.size(); i++) {
			for(int j=0; j<twoKinship.size(); j++) {
				if(oneKinship.get(i).equals(twoKinship.get(j))) {
					count = i+j;
					break;
				}
			}
			//���� for�� Ż��
			if(count != -1) {
				break;
			}
		}
		
		System.out.println(count);
	}
	//�־��� �� ����� �̼��� ����ϴ� ���α׷�
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//
//		//ù° �� : ��ü ����� �� n
//		int totalPeopleNum = in.nextInt();
//		
//		//��° �� : �̼��� ����ؾ� �ϴ� ���� �ٸ� �λ���� ��ȣ
//		int peopleOne = in.nextInt();
//		int peopleTwo = in.nextInt();
//		
//		//��° �� : �θ� �ڽĵ� ���� ������ ���� m
//		int relationNum = in.nextInt();
//		int[][] kinship = new int[relationNum][2];
//		
//		//������ ���� ��ŭ �Է�
//		for(int i=0; i<relationNum; i++) {
//			kinship[i][0] = in.nextInt();
//			kinship[i][1] = in.nextInt();
//		}
//		
//		//��� �����?
//		
//		
//		//
//	}

}
