package study_baekjoon;

import java.util.Scanner;

public class SQ2941_크로아티아알파벳 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//단어 입력
		String text = in.nextLine();
		
		//
		int answer = text.length();
		
		//무식 그 자체
		String[] list = {"c=","c-","d-","lj","nj","s=","z="};
		String exception = "dz=";
		
		for(int i=0; i<text.length()-1; i++) {
			for(int j=0; j<list.length; j++){
				if(text.substring(i, i+2).equals(list[j])) {
					answer -= 1;
				}
			}
			
			if(i>0)
				if(text.substring(i, i+2).equals("z=") && text.substring(i-1, i).equals("d")){
					answer -= 1;
				}
		}
		
		System.out.println(answer);
	}
}
