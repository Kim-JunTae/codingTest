package study_baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 문자열_단계 {

	public static void main(String[] args) {
		String encrypted_text = "qyyigoptvfb";
		String key = "abcdefghijk";
		String answer = "";
		int character = 'a';
		
		String[] list = new String[26];
		
        for(int i=0; i<26; i++){
        	char index = (char) (97+i);
            list[i] = Character.toString(index);
        }
		
        for(int i=0; i<26; i++) {
        	System.out.print(list[i]);
        }
        System.out.println();
        
        for(int i=0; i<encrypted_text.length(); i++){
            int c = encrypted_text.charAt(i);
            int keyIndex = key.charAt(i) - 96;
            
            if(c+keyIndex > 122){
                answer += list[c+keyIndex-122];
            }else{
                answer += list[c+keyIndex-97];
            }
             
        }
        
		System.out.println(answer);
	}
	
	//2675번 문자열 반복
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
