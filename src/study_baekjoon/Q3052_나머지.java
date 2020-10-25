package study_baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q3052_나머지 {

	public static void main(String[] args) {
		//42로 나눈 나머지 중 서로 다른 값이 몇 개 있는 지 출력하는 프로그램
		Scanner in = new Scanner(System.in);

		//자료구조 Set
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			int A = in.nextInt();
			set.add((A%42));
		}
			
		System.out.println(set.size());
	}

}
