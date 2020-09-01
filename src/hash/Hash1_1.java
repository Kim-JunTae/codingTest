package hash;

import java.util.ArrayList;

public class Hash1_1 {
	 public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        ArrayList<String> unCompletion = new ArrayList<String>();
        for(String temp : participant) {
        	unCompletion.add(temp);
        }
        
        String[] list = findAndRemove(completion, unCompletion);
        answer = list.toString();
        
        return answer;
	 }
	 
	 //선형검색
	 public String[] findAndRemove(String[] completion, ArrayList<String> unCompletion) {
		 for(int i=0; i<completion.length; i++) {
			 int unCompletionSize = unCompletion.size();
			 
			 for(int j=0; j<unCompletionSize; j++) {
				 if(completion[i].equals(unCompletion.get(j))) {
					 unCompletion.remove(j);
					 //i+1번째로
					 break;
				 }
			 }
		 }
		 
		 String[] list = new String[unCompletion.size()];
		 unCompletion.toArray(list);
		 
		 return list;
	 }//end findAndRemove()
	 
}
