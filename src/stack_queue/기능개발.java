package stack_queue;

import java.util.ArrayList;
import java.util.List;

public class ��ɰ��� {
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
	    	 //�Ϸ� �۾� ������ �߰�
	    	 for(int i=0; i<workList.size(); i++){
	    		 int todayProgress = workList.get(i).getProgress() + workList.get(i).getSpeed();
	    		 work w = new work(todayProgress, workList.get(i).getSpeed());
	    		 workList.set(i, w);
	    	 }
	    	 
	    	 //���� ���� ���� Ȯ��
	    	 for(int i=0; i<workList.size(); i++) {
	    		 if(workList.get(i).getProgress() >= 100) {
	    			 count++;
	    			 workList.remove(i);
	    			 i = -1;
	    		 }else{
	    			 break;
	    		 }
	    	 }
	    	 
	    	 //������ �۾� ���� �� result�� ���
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
//	     //�۾��� ���� ���� ������ while��, �ð��� �帧
//	     while(list.size() > 0) {
//	    	 
//	    	 //�� �۾��� ������ �ľ��Ͽ� ������ ���� �ִ��� 
//		     for(int i=0; i<list.size(); i++) {
//		    	 //���� �Ϸ� �۾��� �߰�
//		    	 int todayWork = list.get(i) + speedsList.get(i);
//		    	 //�߰��� �۾������� ����
//		    	 list.set(i, todayWork);
//		    	 
//		    	 //������ �۾��� ������ 100%�̻��̸� ���� ����
//		    	 if(list.get(i) >= 100){
//		    		 System.out.println(list.get(i) + " i�� �� : " + i);
//		    		 count++;
//		    		 list.remove(i);
//		    		 speedsList.remove(i);
//		    		 i = -1;
//		    	 }else{
//		    		 //���� ���� �ִ� �۾��� 100%�� �ƴϸ� �ݺ��� Ż��
//		    		 break;
//		    	 }
//		     }
//		     
//		     //������ �۾��� ���� ���� result�� ���
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
