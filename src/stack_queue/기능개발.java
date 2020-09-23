package stack_queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class 기능개발 {
	public static void main(String[] args) {
		 int[] answer = {};
	     int[] progresses = {93, 30, 55};
	     int[] speeds = {1, 30, 5};
	     int count = 0;
	     
	     List<Integer> list = new ArrayList<Integer>();
	     
	     for(int i=0; i<progresses.length; i++) {
	    	 list.add(i, progresses[i]);
	     }
	     
	     for(int i=0; i<list.size(); i++) {
	    	 if(list.get(i) >= 100){
	    		 count++;
	    		 
	    	 }else{
	    		 break;
	    	 }
	     }
	}
}
