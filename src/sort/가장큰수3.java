package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 가장큰수3 {
	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9};
		String answer = "";
		
		//숫자를 문자열로 변환
		String[] result = new String[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			result[i] = String.valueOf(numbers[i]);
		}
		
		//정렬
		Arrays.sort(result, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return ((s2+s1).compareTo(s1+s2));
			}
		});
		
		//0만 여러개 있는 배열의 경우 하나의 0만 리턴
		if(result[0].contentEquals("0")) {
			System.out.println(0);
			
			//return "0";
		}
		
		//정렬된 문자 하나로 합치기
		for(String a : result) {
			answer += a;
		}
		
		System.out.print(answer);
	
	}
}
