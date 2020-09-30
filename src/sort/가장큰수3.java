package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ����ū��3 {
	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9};
		String answer = "";
		
		//���ڸ� ���ڿ��� ��ȯ
		String[] result = new String[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			result[i] = String.valueOf(numbers[i]);
		}
		
		//����
		Arrays.sort(result, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return ((s2+s1).compareTo(s1+s2));
			}
		});
		
		//0�� ������ �ִ� �迭�� ��� �ϳ��� 0�� ����
		if(result[0].contentEquals("0")) {
			System.out.println(0);
			
			//return "0";
		}
		
		//���ĵ� ���� �ϳ��� ��ġ��
		for(String a : result) {
			answer += a;
		}
		
		System.out.print(answer);
	
	}
}
