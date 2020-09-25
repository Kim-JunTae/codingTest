package stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class ������ {

	public static void main(String[] args) {
		int answer = 0;
		//��� ��Ͽ� �ִ� ������ �߿䵵�� ������� ��� �迭
		int[] priorities = {2, 1, 3, 2};
		//���� �μ� ��û�� ������ ���� ����� ��ġ
		int location = 2;
		
		class Work{
			int index;
			int importance;
			
			public Work(int index, int importance) {
				this.index = index;
				this.importance = importance;
			}

			public int getIndex() {
				return index;
			}

			public void setIndex(int index) {
				this.index = index;
			}

			public int getImportance() {
				return importance;
			}

			public void setImportance(int importance) {
				this.importance = importance;
			}
		}
		
		Queue<Work> workList = new LinkedList<Work>();
		
		for(int i=0; i<priorities.length; i++) {
			Work work = new Work(i, priorities[i]);
			for(int j=i+1; j<priorities.length; j++) {
				if(priorities[i] < priorities[j]){
					workList.offer(work);
					break;
				}else if(priorities[i] > priorities[j]){
					if(j == priorities.length-1) {
						workList.add(work);
					}
				}
			}
		}
		
		System.out.println("workList size:" + workList.size());
		
//		for(Work work : workList) {
//			if(work.getIndex() == location) {
//				break;
//			}else{
//				answer++;
//			}
//		}
		
		while(workList.peek() != null){
			Work work = workList.poll();
			if(work.getIndex() == location){
				System.out.println(answer);
				break;
			}else{
				answer++;
			}
		}
				
		System.out.println(answer);
	}

}
