package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ����ū�� {
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
			//���� �ڸ�, �����ڸ�, ���� �ڸ�, õ�� �ڸ� ������ ��
			for(int i=0; i<numList.size(); i++){
				if(numList.size() <= 1) {
					max = numList.get(i);
					numList.remove(i);
				//�� ���ڸ� ��
				}else{
					for(int j=i+1; j<numList.size(); j++){
						if(numList.get(i).charAt(k) > numList.get(j).charAt(k)){
							max = numList.get(i);
							numList.remove(i);
							i=-1;
						}else{//�۰ų� ������ �ٷ� ���� ��ȣ��
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
