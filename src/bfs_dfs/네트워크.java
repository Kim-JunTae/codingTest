package bfs_dfs;

public class 네트워크 {

	static int answer = 0;
	
	public static void main(String[] args) {
		int n = 3;
		int[][] computers = {{1,1,0},
							  {1,1,0},
							  {0,0,1}};
		int[][] computers2 = {{1,1,0},
							  {1,1,1},
							  {0,1,1}};

		boolean[] visit = new boolean[n];
		
		//전체 컴퓨터 방문
		for(int i=0; i<n; i++) {
			//이미 방문하였다면 가지 않음
			if(!visit[i]) {
				//첫 노드 부터 재귀함수 시작
				dfs(n, i, computers, visit);
				answer++;
			}
				
		}
		System.out.println(answer);
	}

	public static void dfs(int n, int index, int[][] computers, boolean[] visit) {
		//방문 확인
		visit[index] = true;
		
		//노드 방문
		for(int i=0; i<n; i++) {
			//연결된 노드, 자신 제외, 아직 방문하지 않은 노드
			if(computers[index][i] == 1 && i != index && !visit[i]) {
				dfs(n, i, computers, visit);
			}
		}
	}//end dfs()
}
