package hash;

import java.util.HashMap;
import java.util.Map;

public class Hash3_1 {
	
	    public int solution(String[][] clothes) {
	        int answer = 1;
	        
	        //�� �ǻ��� ������ ������ ���� ���� �� ���
	        //ex) �� a��, ���� b��, ���� c��, �ѿ� d���̸�
	        //���� �ٸ� ���� ���� ���� (a+1)*(b+1)*(c+1)*(d+1) - 1 : ���� ���� ����� �� 1 ����
	        
	        //�ǻ��� ���� ������ �������� �� ���� �������� �ִ��� value������ �ο�
	        Map<String, Integer> kindsOfClothes = new HashMap<String, Integer>();
	        
	        for(int i = 0; i<clothes.length; i++){
	            if(!kindsOfClothes.containsKey(clothes[i][1])){  //HashMap�� �ǻ��� ������ Key������ ���ٸ�
	                kindsOfClothes.put(clothes[i][1], 1);
	                
	            }else{  //HashMap�� �ǻ��� ������ Key������ �ִٸ� value�� 1 ����
	            	kindsOfClothes.put(clothes[i][1], kindsOfClothes.get(clothes[i][1])+1);
	            }
	        }
	        
	        for(String key : kindsOfClothes.keySet()) {
	        	answer = answer * (kindsOfClothes.get(key)+1);
	        }
	        
	        answer -= 1;
	        
	        return answer;
	    }
}