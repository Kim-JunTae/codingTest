package study_baekjoon;

public class ��ܿ����� {

	public static int solution(int stairs, int[] score){
		int answer = 0;
		
		//stairs�� 1, 2, 3, 4�̻��� �� ������ ����
		if(stairs == 1)
			return score[0];
		
		if(stairs == 2)
			return score[0] + score[1];
		
		if(stairs == 3)
			if((score[0]+score[2]) >= (score[1]+score[2]))
				return score[0]+score[2];
			else
				return score[1]+score[2];
		
		//���ص� ������ ������ �� �����Ͱ� ���������� ���� ���� ���� ���ؼ�
		//+ stairs % 4 �������� 1, 2, 3, 0 �϶�...
		if(stairs >= 4) {
			//4���� ����� �׷����� �����ϰ�
			//������ ��ܰ� ������ �� ����ִ� �׷� ����(stairs, stair-1)
			for(int i=0; i<stairs-4; i+=4) {
				int min = score[i];
				int sum = score[i]+score[i+1]+score[i+2]+score[i+3];
				
				//4���� �� �� ���� ���� �� ã��
				if(min > score[i+1])
					min = score[i+1];
				else if(min > score[i+2])
					min = score[i+2];
				else if(min > score[i+3])
					min = score[i+3];
				
				//�տ��� ���� ���� �� ����
				sum -= min;
				answer += sum;
				System.out.println("sum = " + sum);
				System.out.println("answer = " + answer);				
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int stairs = 6;
		int[] score = {10, 20, 15, 25, 10, 20};
		
		int answer = solution(stairs, score);
		System.out.println(answer);
	}

}
