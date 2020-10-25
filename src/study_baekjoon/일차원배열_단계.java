package study_baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 일차원배열_단계 {
	//4344번 평균은 넘겠지
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int C = in.nextInt();
		double[] rate = new double[C];
		
		for(int i=0; i<C; i++) {
			//테스트 케이스마다 1 <= 학생 수 <= 1000
			int N = in.nextInt();
			double sum = 0;
			double avg = 0;
			double count = 0;
			
			int[] scoreList = new int[N];
			
			//0<= 점수 <=100
			for(int j=0; j<N; j++){
				scoreList[j] = in.nextInt();
				sum += scoreList[j];
			}
			
			avg = sum/N;
			for(int k=0; k<N; k++) {
				if(scoreList[k] > avg) {
					count++;
				}
			}
			
			rate[i] = (count/N)*100;
		}
		
		for(int i=0; i<C; i++)
			System.out.println(String.format("%.3f", rate[i]) + "%");
	}
	
	//8958번 OX퀴즈
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		//테스크 케이스의 갯수
//		int N = in.nextInt();
//		//테스크 케이스
//		String[] testCase = new String[N];
//		//입력
//		for(int i=0; i<N; i++) {
//			testCase[i] = in.next();
//		}
//		
//		//점수 계산
//		for(int i=0; i<N; i++) {
//			String test = testCase[i];
//			int sum = 0;
//			int score = 0;
//			
//			for(int j=0; j<test.length(); j++) {
//				if(test.charAt(j) == 'O') {
//					score++;
//					sum += score;
//				}else{
//					score = 0;
//				}	
//			}
//			
//			System.out.println(sum);
//		}
//	}
	
	//Q1546 평균
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		//최댓값
//		double max = 0;
//		
//		//시험 본 과목의 개수 N
//		int N = in.nextInt();
//		
//		//시험 본 과목의 점수를 저장할 배열
//		double[] scoreList = new double[N];
//		
//		//점수 입력 및 최댓값 찾기
//		for(int i=0; i<N; i++) {
//			scoreList[i] = in.nextDouble();
//			if(max < scoreList[i]) {
//				max = scoreList[i];
//			}
//		}
//		
//		//새로운 평균 구하기
//		double sum = 0;
//		double newAvg = 0;
//		
//		for(int i=0; i<N; i++) {
//			sum += (scoreList[i]/max)*100;
//			//System.out.println("더하는 중 " + sum);
//		}
//		
//		newAvg = sum/N;
//		//System.out.println("max " + max);
//		System.out.println(newAvg);
//	}
	
	
	//Q3052 나머지
//	public static void main(String[] args) {
//		//42로 나눈 나머지 중 서로 다른 값이 몇 개 있는 지 출력하는 프로그램
//		Scanner in = new Scanner(System.in);
//
//		//자료구조 Set
//		Set<Integer> set = new HashSet<Integer>();
//		
//		for(int i=0; i<10; i++) {
//			int A = in.nextInt();
//			set.add((A%42));
//		}
//			
//		System.out.println(set.size());
//	}
	
	//Q2577 숫자의 개수
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		int A = in.nextInt();
//		int B = in.nextInt();
//		int C = in.nextInt();
//		
//		int[] answer = new int[10];
//		
//		String ABC = Integer.toString(A*B*C);
//		//System.out.println(ABC);
//		
//		for(int i=0; i<10; i++) {
//			for(int j=0; j<ABC.length(); j++) {
//				if(i == Integer.parseInt(ABC.substring(j, j+1)) )
//					answer[i]++;
//			}
//		}
//		
//		for(int i=0; i<answer.length; i++)
//			System.out.println(answer[i]);
//	}
	
	
	//Q2562 최댓값
//	public static void main(String[] args) {
//		int[] list = new int[9];
//		
//		Scanner in = new Scanner(System.in);
//		int max = 0;
//		for(int i=0; i<9; i++) {
//			list[i] = in.nextInt();
//			if(list[i] > max)
//				max = list[i];
//		}
//		
//		for(int i=0; i<9; i++) {
//			if(list[i] == max) {
//				System.out.println(list[i]);
//				System.out.println(i+1);
//				break;
//			}
//		}
//	}
	
	
	//Q10818번 최소, 최대
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		int min = 0;
//		int max = 0;
//		
//		int N = in.nextInt();
//		
//		int number = in.nextInt();
//		max = number;
//		min = number;
//		
//		for(int i=0; i<N-1; i++) {
//			number = in.nextInt();
//			if(number > max)
//				max = number;
//			if(number < min)
//				min = number;
//		}
//		
//		System.out.println(min + " " + max);
//	}
}
