package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class K번째수 {
	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		
		int[] answer = {};
		
		int answerCount = commands.length;
        answer = new int[answerCount];
        List<Integer> answerList = new ArrayList<Integer>();
        
        //commands의 길이 = 답의 갯수
        for(int i=0; i<answerCount; i++){
            int startNum = commands[i][0];
            int endNum = commands[i][1];
            int findNum = commands[i][2];
            
            int[] newArray1 = Arrays.copyOfRange(array, startNum-1, endNum);
            Arrays.sort(newArray1);
            answerList.add(newArray1[findNum-1]);    
        }
        
        for(int i=0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
		
        for(int ans : answer) {
        	System.out.print(ans);
        }
		
	}
}
