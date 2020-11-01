package study_baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Scanner;
//실패목록 : 2675번,
public class 문자열_단계 {
	//1157번 단어 공부 : 실패, 메모리초과 및 정답 X
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		
		HashSet<String> set = new HashSet<String>();
		for(int i=0; i<word.length(); i++) {
			set.add(word.substring(i, i+1));
		}
		
		String[] list = new String[set.size()];
		int count = 0;
		for(String w : set) {
			list[count] = w;
			count++;
		}
		
		int[] answer = new int[set.size()];
		for(int i=0; i<list.length; i++) {
			for(int j=0; j<word.length(); j++){
				if(list[i].equals(word.substring(j, j+1))) {
					answer[i]++;
				}
			}
		}
		
		int max = -1;
		for(int i=0; i<answer.length; i++) {
			if(max < answer[i]) {
				max = i;
			}else if(max == answer[i]) {
				max = -1;
				break;
			}
		}
		
		if(max >= 0)
			System.out.println(list[max]);
		else
			System.out.println("?");
	}
	
	//2675번 문자열 반복 : 실패 다시해보기
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int T = br.read();
//		int[] RList = new int[T];
//		String[] SList = new String[T];
//		String[] PList = new String[T];
//		
//		for(int i=0; i<T; i++){
//			String text = br.readLine();
//			String[] word = text.split(" ");
//			
//			RList[i] = Integer.parseInt(word[0]);
//			SList[i] = word[1];
//		}
//		
//		for(int i=0; i<T; i++) {
//			String P = "";
//			int R = RList[i];
//			String S = SList[i];
//			for(int j=0; j<S.length(); j++) {
//				for(int k=0; k<R; k++) {
//					P += S.substring(j, j+1);
//				}
//			}
//			PList[i] = P;
//		}
//		
//		for(int i=0; i<T; i++) {
//			System.out.println(PList[i]);
//		}
//	}
	
	//10809번 알파벳 찾기
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		//알파벳 소문자로 이루어진 단어 S
//		String S = in.nextLine();
//		
//		//알파벳 위치
//		int[] alphaIndex = new int[26];
//		
//		for(int i=0; i<alphaIndex.length; i++) {
//			alphaIndex[i] = -1;
//		}
//		
//		for(int i=S.length()-1; i>=0; i--) {
//			int character = S.charAt(i);
//			for(int alphabet=97; alphabet<123; alphabet++){
//				if(character == alphabet) {
//					alphaIndex[alphabet-97] = i;
//				}
//			}
//		}
//		
//		for(int i=0; i<alphaIndex.length; i++) {
//			System.out.print(alphaIndex[i] + " ");
//		}
//	}
	
	//11720번 숫자의 합
	//String -> char -> int 변환
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int sum = 0;
//		int N = in.nextInt();
//		String numbers = in.next();
//		
//		for(int i=0; i<N; i++)
//			sum += numbers.charAt(i)-'0';
//		
//		System.out.println(sum);
//	}
	
	//11654번 아스키 코드
	//https://st-lab.tistory.com/59
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		String str = in.next();
//		int answer = str.charAt(0);
//		in.close();
//		System.out.println(answer);
//	}
}
