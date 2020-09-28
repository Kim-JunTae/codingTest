package exhaustiveSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ���ǰ�� {
	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		
		//�� �����ڵ��� �迭
		int[][] supoMember = new int[][] {{1,2,3,4,5},
										  {2,1,2,3,2,4,2,5},
										  {3,3,1,1,2,2,4,4,5,5}};
		
		//����� ��
		int[] result = new int[3];
		for(int i=0; i<answers.length; i++) {
			for(int j=0; j<3; j++) {
				if(answers[i] == supoMember[j][i%supoMember[j].length]){
					result[j]++;
				}
			}
		}
		
		//�ִ밪 ã��
		int max = 0;
		for(int i=0; i<3; i++) {
			if(result[i] > max) {
				max = result[i];
			}
		}
		
		//�ִ밪�� 0�̸� �� 0��
		if(max == 0) {
			System.out.println(new int[]{});
		}
		
		//�ִ밪�� ���� ���� ���� �ε��� ����
		List<Integer> winner = new ArrayList<Integer>();
		for(int i=0; i<3; i++) {
			if(result[i] == max) {
				winner.add(i);
			}
		}
		
		//���� �迭 ���� �� ���� �� ����
		int size = winner.size();
		int[] answer = new int[size];
		for(int i=0; i<size; i++) {
			answer[i] = winner.get(i) + 1;
		}
		
		Arrays.sort(answer);
		
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}

