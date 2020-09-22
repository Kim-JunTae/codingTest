package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class K번째수 {
	public static void main(String[] args) {
		int[] answer = {};
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        
        int answerCount = commands.length;
        answer = new int[answerCount];
        List<Integer> answerList = new ArrayList<Integer>(answerCount);
        
        //commands의 길이 = 답의 갯수
        for(int i=0; i<answerCount; i++){
            int startNum = commands[i][0];
            int endNum = commands[i][1];
            int findNum = commands[i][2];
            
            int[] newArray1 = Arrays.copyOfRange(array, startNum-1, endNum);
            
            for(int j=0; j<newArray1.length; j++) {
            	System.out.print(newArray1[j]);
            }
            
            Arrays.sort(newArray1);
            
            for(int j=0; j<newArray1.length; j++) {
            	System.out.print(newArray1[j]);
            }
            System.out.println(findNum);
            answerList.add(newArray1[findNum-1]);
        }
        
        for(int i=0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
        
        //System.out.println(answer);
	}
}
