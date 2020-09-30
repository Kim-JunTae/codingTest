package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 가장큰수2 {
	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9};
		String answer = "";
		String max = "";
		
		Arrays.sort(numbers);
		List<String> numList = new ArrayList<>();
		for(int num : numbers) {
			numList.add(Integer.toString(num));
		}
		
		List<String> result = new ArrayList<>();
		for(int i=9; i>-1; i--) {
			for(int j=0; j<numList.size(); j++){
				if(numList.get(j).substring(0, 1).equals(Integer.toString(i))){
					result.add(numList.get(j));
				}
			}
		}
		
		for(int i=0; i<result.size(); i++) {
			int first, second, third, fourth;
			if(result.get(i).length() >= 1) {
				first = result.get(i).charAt(0);
			}
			if(result.get(i).length() >= 2) {
				second = result.get(i).charAt(1);
			}
			if(result.get(i).length() >= 3) {
				third = result.get(i).charAt(2);
			}
			if(result.get(i).length() >= 4) {
				fourth = result.get(i).charAt(3);
			}
			
			max += result.get(i);
			System.out.print(max);
		}
		answer = max;
	}
}
