package study_baekjoon;

import java.util.Scanner;

public class SQ2644_촌수계산 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//첫째 줄 : 전체 사람의 수 n
		int totalPeopleNum = in.nextInt();
		
		//둘째 줄 : 촌수를 계산해야 하는 서로 다른 두사람의 번호
		int peopleOne = in.nextInt();
		int peopleTwo = in.nextInt();
		
		//셋째 줄 : 부모 자식들 간의 관계의 개수 m
		int m = in.nextInt();
		
		//int[][] kinship = new int[relationNum][2];
		//boolean[][] kinship = new boolean[totalPeopleNum][totalPeopleNum];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		//관계의 갯수 만큼 입력
		//x는 y의 부모이다.
		for(int i=0; i<m; i++) {
			int value = in.nextInt(); 	//부모
			int key = in.nextInt();		//자식
			map.put(key, value);
		}
		
		//한사람의 가계도 그리기
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
		
		//촌수 구하기
		int count = -1;
		for(int i=0; i<oneKinship.size(); i++) {
			for(int j=0; j<twoKinship.size(); j++) {
				if(oneKinship.get(i).equals(twoKinship.get(j))) {
					count = i+j;
					break;
				}
			}
			//이중 for문 탈출
			if(count != -1) {
				break;
			}
		}
		
		System.out.println(count);
	}
	//주어진 두 사람의 촌수를 계산하는 프로그램
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//
//		//첫째 줄 : 전체 사람의 수 n
//		int totalPeopleNum = in.nextInt();
//		
//		//둘째 줄 : 촌수를 계산해야 하는 서로 다른 두사람의 번호
//		int peopleOne = in.nextInt();
//		int peopleTwo = in.nextInt();
//		
//		//셋째 줄 : 부모 자식들 간의 관계의 개수 m
//		int relationNum = in.nextInt();
//		int[][] kinship = new int[relationNum][2];
//		
//		//관계의 갯수 만큼 입력
//		for(int i=0; i<relationNum; i++) {
//			kinship[i][0] = in.nextInt();
//			kinship[i][1] = in.nextInt();
//		}
//		
//		//노드 만들기?
//		
//		
//		//
//	}

}
