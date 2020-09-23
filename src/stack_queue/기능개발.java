package stack_queue;

import java.util.ArrayList;
import java.util.List;

public class 기능개발 {
	public static void main(String[] args) {
		 int[] answer = {};
	     int[] progresses = {93, 30, 55};
	     int[] speeds = {1, 30, 5};
	     int count = 0;
	     
	     class work{
	    	 int progress;
    		 int speed;
	    	 
	    	 public work() {
	    	 }
	    	 
	    	 public work(int progress, int speed) {
	    		this.progress = progress;
	    		this.speed = speed;
	    	 }

	    	 public int getProgress() {
	    		 return progress;
	    	 }

	    	 public void setProgress(int progress) {
	    		 this.progress = progress;
	    	 }

	    	 public int getSpeed() {
	    		 return speed;
	    	 }

	    	 public void setSpeed(int speed) {
	    		 this.speed = speed;
	    	 }
	     }
	     
	     List<work> workList = new ArrayList<work>();
	     List<Integer> result = new ArrayList<Integer>();
	     
	     for(int i=0; i<progresses.length; i++) {
	    	 workList.add(new work(progresses[i], speeds[i]));
	     }
	     
	     while(workList.size() > 0) {
	    	 //하루 작업 진도량 추가
	    	 for(int i=0; i<workList.size(); i++){
	    		 int todayProgress = workList.get(i).getProgress() + workList.get(i).getSpeed();
	    		 work w = new work(todayProgress, workList.get(i).getSpeed());
	    		 workList.set(i, w);
	    	 }
	    	 
	    	 //배포 가능 여부 확인
	    	 for(int i=0; i<workList.size(); i++) {
	    		 if(workList.get(i).getProgress() >= 100) {
	    			 count++;
	    			 workList.remove(i);
	    			 i = -1;
	    		 }else{
	    			 break;
	    		 }
	    	 }
	    	 
	    	 //배포할 작업 있을 때 result에 담기
		     if(count != 0) {
			     result.add(count);
			     count = 0;
		     }
	     }
	     
	     answer = new int[result.size()];
	     for(int i=0; i<answer.length; i++) {
	    	 answer[i] = result.get(i);
	    	 System.out.println(result.get(i));
	     }
	     
//	     List<Integer> list = new ArrayList<Integer>();
//	     List<Integer> speedsList = new ArrayList<Integer>();
//	     List<Integer> result = new ArrayList<Integer>();
//	     
//	     for(int i=0; i<progresses.length; i++) {
//	    	 list.add(i, progresses[i]);
//	    	 speedsList.add(i, speeds[i]);
//	     }
//	     
//	     //작업할 것이 없을 때까지 while문, 시간의 흐름
//	     while(list.size() > 0) {
//	    	 
//	    	 //각 작업의 진도를 파악하여 배포할 것이 있는지 
//		     for(int i=0; i<list.size(); i++) {
//		    	 //오늘 하루 작업량 추가
//		    	 int todayWork = list.get(i) + speedsList.get(i);
//		    	 //추가된 작업량으로 변경
//		    	 list.set(i, todayWork);
//		    	 
//		    	 //오늘의 작업의 진도가 100%이상이면 배포 가능
//		    	 if(list.get(i) >= 100){
//		    		 System.out.println(list.get(i) + " i의 값 : " + i);
//		    		 count++;
//		    		 list.remove(i);
//		    		 speedsList.remove(i);
//		    		 i = -1;
//		    	 }else{
//		    		 //가장 먼저 있는 작업이 100%가 아니면 반복문 탈출
//		    		 break;
//		    	 }
//		     }
//		     
//		     //배포할 작업이 있을 때만 result에 담기
//		     if(count != 0) {
//			     result.add(count);
//			     count = 0;
//		     }
//	     }
//	     
//	     answer = new int[result.size()];
//	     for(int i=0; i<answer.length; i++) {
//	    	 answer[i] = result.get(i);
//	    	 System.out.println(result.get(i));
//	     }
	}
}
