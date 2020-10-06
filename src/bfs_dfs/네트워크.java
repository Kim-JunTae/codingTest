package bfs_dfs;

public class ��Ʈ��ũ {

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
		
		//��ü ��ǻ�� �湮
		for(int i=0; i<n; i++) {
			//�̹� �湮�Ͽ��ٸ� ���� ����
			if(!visit[i]) {
				//ù ��� ���� ����Լ� ����
				dfs(n, i, computers, visit);
				answer++;
			}
				
		}
		System.out.println(answer);
	}

	public static void dfs(int n, int index, int[][] computers, boolean[] visit) {
		//�湮 Ȯ��
		visit[index] = true;
		
		//��� �湮
		for(int i=0; i<n; i++) {
			//����� ���, �ڽ� ����, ���� �湮���� ���� ���
			if(computers[index][i] == 1 && i != index && !visit[i]) {
				dfs(n, i, computers, visit);
			}
		}
	}//end dfs()
}
