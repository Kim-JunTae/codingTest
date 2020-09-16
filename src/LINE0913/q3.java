package LINE0913;

import java.util.ArrayList;
import java.util.List;

public class q3 {
	public static void main(String[] args) {
		int n = 100320105;
		int[] answer = {};
		int count=0;
		int result;
		int index = 0;
		
		List<String> list = new ArrayList<String>();
		String number = Integer.toString(n);
		//String[] list = number.split("0");
		
		while(index >= 0) {
			index = number.lastIndexOf("0");
			System.out.println(index);
			String addNum1 = number.substring(0, index-1);
			String addNum2 = number.substring(index, number.length());
            number = addNum1+addNum2;
            count++;
            System.out.println(number);
		}
		
		
		
//		for(int i=0; i<list.length; i++) {
//			System.out.println(list[i]);
//		}
		//System.out.println(answer);
	}
	
}
