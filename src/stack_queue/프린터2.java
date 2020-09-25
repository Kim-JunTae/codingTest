package stack_queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ������2 {
	public static void main(String[] args) {
		int answer = 0;
		//��� ��Ͽ� �ִ� ������ �߿䵵�� ������� ��� �迭
		int[] priorities = {2, 1, 3, 2};
		//���� �μ� ��û�� ������ ���� ����� ��ġ
		int location = 2;
		
		//�迭�� ���Ḯ��Ʈ ���·�.
		List<Integer> list = new LinkedList<Integer>();
		for(int i=0; i<priorities.length; i++) {
			list.add(priorities[i]);
		}
		
		//���� �迭 �������� ����
		Arrays.sort(priorities);
		//���� ���� �տ� �ִ� ������ �ε���
		int index = 0; 
		//��� Ƚ��
		int count = 0;
		
		while(list.size() > 0) {
			//�ε��� ���� ����(0~list.size)
			if(index==list.size()) {
				index=0;
			}
			
			//���� �ε����� ���ڰ� �迭�� ���� ������ ���� ���ٸ� ����ص� �Ǵ� ���� ū��
			if(list.get(index) == priorities[priorities.length-1-count]) {
				count++;
				if(index==location) {
					break;
				}else if(index < location){
					location--;
				}
				
				list.remove(index);
			}else{
			//�ƴ϶�� index�� �̵�
				if(index == list.size()-1) {
					index = 0;
				}else{
					index++;
				}
			}
		}
		answer = count;
		System.out.println(answer);
	}
}
