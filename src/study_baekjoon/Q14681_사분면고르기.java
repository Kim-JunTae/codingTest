package study_baekjoon;

import java.util.Scanner;

public class Q14681_사분면고르기 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();

		if(x > 0 && y > 0)
			System.out.println(1);
		else if(x > 0 && y < 0)
			System.out.println(4);
		else if(x < 0 && y > 0)
			System.out.println(2);
		else if(x < 0 && y < 0)
			System.out.println(3);
		else
			System.out.println("x,y는 0,0");
	}

}
