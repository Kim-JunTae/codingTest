package study_baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q3052_������ {

	public static void main(String[] args) {
		//42�� ���� ������ �� ���� �ٸ� ���� �� �� �ִ� �� ����ϴ� ���α׷�
		Scanner in = new Scanner(System.in);

		//�ڷᱸ�� Set
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			int A = in.nextInt();
			set.add((A%42));
		}
			
		System.out.println(set.size());
	}

}
