package hash;

import java.util.ArrayList;
import java.util.Arrays;

public class Hash1_2 {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0; i<completion.length; i++) {
        	if(!participant[i].equals(completion[i])){
        		return answer=participant[i];
        	}
        }
        return answer=participant[participant.length-1];
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
