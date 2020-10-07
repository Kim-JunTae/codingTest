package bfs_dfs;

public class ������ {

	public static void main(String[] args) {
		String[] answer = {};
		String[][] tickets = {{"ICN","JFK"},
							  {"HND", "IAD"},
							  {"JFK","HND"}};
		
		boolean[] visit = new boolean[tickets.length+1];
		
		answer = new String[tickets.length+1];
		answer[0] = "ICN";
		
		for(int i=1; i<tickets.length+1; i++) {
			answer[i] = findTicket(answer[i-1], tickets, visit);
		}
		
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
	
	public static String findTicket(String city, String[][] tickets, boolean[] visit) {
		String arrivalCity = "ZZZ";
		int index = 0;
		for(int i=0; i<tickets.length; i++) {
			//����� ���ÿ� Ƽ���� ������� ����, ������ ������ �̸��� �� �� ������ ���ú��� �ڿ� �ְ�, ������� ���� Ƽ���̶��, �������� �ʱ�ȭ
			if(city.equals(tickets[i][0]) && arrivalCity.compareTo(tickets[i][1]) >= 0 && !visit[i]){
				arrivalCity = tickets[i][1];
				index = i;
			}
		}
		visit[index] = true;
		return arrivalCity;
	}

}
