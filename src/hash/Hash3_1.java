package hash;

import java.util.HashMap;
import java.util.Map;

public class Hash3_1 {
	
	    public int solution(String[][] clothes) {
	        int answer = 1;
	        
	        //각 의상의 종류의 갯수의 따라 조합 수 계산
	        //ex) 얼굴 a개, 상의 b개, 하의 c개, 겉옷 d개이면
	        //서로 다른 옷의 조합 수는 (a+1)*(b+1)*(c+1)*(d+1) - 1 : 착용 안한 경우의 수 1 빼기
	        
	        //의상의 종류 갯수와 종류마다 몇 개의 아이템이 있는지 value값으로 부여
	        Map<String, Integer> kindsOfClothes = new HashMap<String, Integer>();
	        
	        for(int i = 0; i<clothes.length; i++){
	            if(!kindsOfClothes.containsKey(clothes[i][1])){  //HashMap에 의상의 종류가 Key값으로 없다면
	                kindsOfClothes.put(clothes[i][1], 1);
	                
	            }else{  //HashMap에 의상의 종류가 Key값으로 있다면 value값 1 증가
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