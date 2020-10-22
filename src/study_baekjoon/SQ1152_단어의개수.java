package study_baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SQ1152_단어의개수 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str;
		
		str = br.readLine();
		st = new StringTokenizer(str, " ");
		System.out.println(st.countTokens());
	}
	
	//1019
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//	
//		String text = in.nextLine();
//		String[] words = text.split(" ");
//		
//		if(words[0].equals("") || words[words.length-1].equals(""))
//			System.out.println(words.length-1);
//		else
//			System.out.println(words.length);
//	}
}