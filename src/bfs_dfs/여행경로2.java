package bfs_dfs;

import java.util.ArrayList;
import java.util.List;

public class 여행경로2 {

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
			
			//최초 출발지 ICN
			if(tickets[i][0].equals("ICN")) {
				//첫번째 티켓 정보는 미리 담아두고 재귀 함수 호출
				result[0] = tickets[i][0];
				result[1] = tickets[i][1];
				
				//재귀함수 호출
				//해당 티켓을 사용한 경우와 사용하지 않았을 경우를 모두 체크
				used[i] = true;
				dfs(tickets, used, 2, tickets[i][1], result);
				used[i] = false;
			}
		}
		
		//배열 오름차순 정렬
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
		
		//오름차순 정렬된 배열의 첫번째 리턴
		return resultList.get(0);
	}//end solution

	private static void dfs(String[][] tickets, boolean[] used, int resultIdx, String pre, String[] result) {
		//모든 티켓을 다 썻을 경우
		if(resultIdx == result.length) {
			String[] temp = new String[result.length];
			for(int i=0; i<result.length; i++) {
				temp[i] = result[i];
			}
			resultList.add(temp);
			return;
		}
		
		for(int i=0; i<tickets.length; i++) {
			//이전 티켓의 목적지와 현재 티켓의 출발지가 같다면
			if(!used[i] && tickets[i][0].equals(pre)) {
				result[resultIdx] = tickets[i][1]; // 도착지 입력
				
				//재귀함수 호출
				used[i] = true; //티켓 사용
				dfs(tickets, used, resultIdx+1, tickets[i][1], result);
				used[i] = false;	//티켓 미사용
			}
		}
	}//end dfs
	
}
