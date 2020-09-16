package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class 두개뽑아서더하기 {
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		int[] answer = {};
		//Object list = new Object();
		HashSet<Integer> hashset = new HashSet<Integer>();
		
		//TreeSet<Integer> treeset = new TreeSet<Integer>();
		
		//List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<numbers.length-1; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				//list.add(numbers[i] + numbers[j]);
				hashset.add(numbers[i] + numbers[j]);
				//treeset.add(numbers[i] + numbers[j]);				
			}
		}
		
		answer =  hashset.stream().mapToInt(i->i).toArray();
		
//		String result[] = hashset.toArray(new String[hashset.size()]);
//		
//		for(int i=0; i<result.length; i++) {
//			answer[i] = Integer.parseInt(result[i]);
//		}
		//System.out.println("hashset : " + hashset);
		//System.out.println("treeset : " + treeset);
		//System.out.println("list : " + list);
		System.out.println("answer : " + answer);
	}
}
