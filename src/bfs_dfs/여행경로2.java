package bfs_dfs;

import java.util.ArrayList;
import java.util.List;

public class ������2 {

	static List<String[]> resultList;
	
	public static void main(String[] args) {
		String[] answer = {};
		String[][] tickets = {{"ICN","JFK"},
							  {"HND", "IAD"},
							  {"JFK","HND"}};
		answer = solution(tickets);
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}	
	
	public static String[] solution(String[][] tickets) {
		resultList = new ArrayList<>();
		String[] result = new String[tickets.length+1];
		boolean[] used = new boolean[tickets.length+1];
		
		for(int i=0; i<tickets.length; i++) {
			
			//���� ����� ICN
			if(tickets[i][0].equals("ICN")) {
				//ù��° Ƽ�� ������ �̸� ��Ƶΰ� ��� �Լ� ȣ��
				result[0] = tickets[i][0];
				result[1] = tickets[i][1];
				
				//����Լ� ȣ��
				//�ش� Ƽ���� ����� ���� ������� �ʾ��� ��츦 ��� üũ
				used[i] = true;
				dfs(tickets, used, 2, tickets[i][1], result);
				used[i] = false;
			}
		}
		
		//�迭 �������� ����
		resultList.sort((o1, o2) -> {
			for(int i=0; i<o1.length; i++) {
				if(o1[i].compareTo(o2[i]) > 0) {
					return 1;
				}else if(o1[i].compareTo(o2[i]) < 0) {
					return -1;
				}
			}
			return 0;
		});
		
		//�������� ���ĵ� �迭�� ù��° ����
		return resultList.get(0);
	}//end solution

	private static void dfs(String[][] tickets, boolean[] used, int resultIdx, String pre, String[] result) {
		//��� Ƽ���� �� ���� ���
		if(resultIdx == result.length) {
			String[] temp = new String[result.length];
			for(int i=0; i<result.length; i++) {
				temp[i] = result[i];
			}
			resultList.add(temp);
			return;
		}
		
		for(int i=0; i<tickets.length; i++) {
			//���� Ƽ���� �������� ���� Ƽ���� ������� ���ٸ�
			if(!used[i] && tickets[i][0].equals(pre)) {
				result[resultIdx] = tickets[i][1]; // ������ �Է�
				
				//����Լ� ȣ��
				used[i] = true; //Ƽ�� ���
				dfs(tickets, used, resultIdx+1, tickets[i][1], result);
				used[i] = false;	//Ƽ�� �̻��
			}
		}
	}//end dfs
	
}
