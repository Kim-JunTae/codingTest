package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 두개뽑아서더하기 {
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		int[] answer = {};
		
		Set<Integer> set = new HashSet();
		
		for(int i=0; i<numbers.length-1; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				set.add(numbers[i]+numbers[j]);
			}
		}
		
		List<Integer> arrayList = new ArrayList<Integer>(set);
		
		Collections.sort(arrayList);
		int size = arrayList.size();
		for(int i=0; i<size-1; i++) {
			if(arrayList.get(i) == arrayList.get(i+1))
				arrayList.remove(i+1);
		}

		answer = new int[arrayList.size()];
		for(int i=0; i<arrayList.size(); i++) {
			answer[i] = arrayList.get(i);
		}
		
		System.out.println("arrayList : " + arrayList.get(0));
		System.out.println("answer : " + answer);
		
//		HashSet<Integer> hashset = new HashSet<Integer>();
//    
//	    for(int i=0; i<numbers.length-1; i++) {
//			for(int j=i+1; j<numbers.length; j++) {
//				hashset.add(numbers[i] + numbers[j]);
//			}
//		}
//    
//	    answer =  hashset.stream().mapToInt(i->i).toArray();
	}
}
