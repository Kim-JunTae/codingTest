package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 가장큰수 {
	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9};
		String answer = "";
		
		Arrays.sort(numbers);
		List<String> numList = new ArrayList<String>();
		for(int num : numbers) {
			numList.add(Integer.toString(num));
		}
		
		String max = "";
		for(int k=0; k<4; k++) {
			//일의 자리, 십의자리, 백의 자리, 천의 자리 순으로 비교
			for(int i=0; i<numList.size(); i++){
				if(numList.size() <= 1) {
					max = numList.get(i);
					numList.remove(i);
				//앞 한자리 비교
				}else{
					for(int j=i+1; j<numList.size(); j++){
						if(numList.get(i).charAt(k) > numList.get(j).charAt(k)){
							max = numList.get(i);
							numList.remove(i);
							i=-1;
						}else{//작거나 같으면 바로 다음 번호로
							break;
						}
					}
				}
				answer += max;
			}
		}
		
		System.out.println(answer);
	}
}
