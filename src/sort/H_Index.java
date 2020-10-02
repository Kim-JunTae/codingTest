package sort;

import java.util.Arrays;

public class H_Index {
	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5};
		int answer = 0;
		
		int n = citations.length;
		Arrays.sort(citations);
		
		for(int i=0; i<n; i++) {
			if(n-i+1 > citations[i]) {
				answer = citations[i];
			}else{
				break;
			}
		}
		
		System.out.println(answer);
	}
}
