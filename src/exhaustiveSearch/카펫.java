package exhaustiveSearch;

public class 카펫 {
	static int brown = 10;
	static int yellow = 2;
	
	//카펫의 가로, 세로 크기를 순서대로 배열에 담아 return
	//가로 >= 세로
	
	class Solution {
	    public int[] solution(int brown, int yellow) {
	        int[] answer = {};
	        double limit = Math.sqrt(yellow);
	        for(int i=1; i<limit; i++) {
	        	int[] result = getWidthLength(yellow, i);
	        	if(checkAnswer(result, brown)) {
	        		answer = new int[2];
	        		answer[0] = result[0];
	        		answer[1] = result[1];
	        		break;
	        	}
	        }
	        return answer;
	    }
	    
	    public int[] getWidthLength(int num, int i) {
	    	int[] result = new int[2];
	    	if(num%i == 0) {
	    		result[0] = num/i;
	    		result[1] = i;
	    	}
	    	return result;
	    }//end getWidthLength()
	    
	    public boolean checkAnswer(int[] widthLength, int brown){
	    	int width = widthLength[0];
	    	int length = widthLength[1];
	    	if((width*length)+4 == brown)
	    		return true;
	    	return false;
	    }//end checkAnswer()
	}
	
}
