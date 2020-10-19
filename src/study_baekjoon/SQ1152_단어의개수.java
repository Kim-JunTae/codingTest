package study_baekjoon;

import java.util.Scanner;

public class SQ1152_단어의개수 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		String text = in.nextLine();
		String[] words = text.split(" ");
		
		if(words[0].equals("") || words[words.length-1].equals(""))
			System.out.println(words.length-1);
		else
			System.out.println(words.length);
	}
}