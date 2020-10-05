package study_baekjoon;

public class ��ܿ�����2 {

	public static int solution(int stairs, int[] score){
		int answer = 0;
		
		int min = 0;
		int totalSum = 0;
		int minSum = 0;
		
		//stairs�� 1, 2, 3�̻��� �� ������ ����
		if(stairs == 1)
			return score[0];
		
		if(stairs == 2)
			return score[0] + score[1];
		
		if(stairs == 3)
			if((score[0]+score[2]) >= (score[1]+score[2]))
				return score[0]+score[2];
			else
				return score[1]+score[2];
		
		for(int i=0; i<stairs; i++) {
			totalSum += score[i];
		}
		
		//��� �� 4�� �̻�
		//��� 3�� �� ���� ���� �� ã�� : X
		for(int i=1; i<stairs-3; i+=3) {
			min = score[i];
			
			if(min > score[i+1]) {
				min = score[i+1];
			}else if(min > score[i+2]){
				min = score[i+2];
				//��� 3�� �� �� ����� ���� ���� ���� ��, ���� ��� ������ ��ƾ� �ǹǷ� ����
				i++;
			}
			
			minSum += min;
			System.out.print(min + " ");
		}
		
		if(min != score[stairs-4])
			min = score[stairs-3];
		
		if(min > score[stairs-2])
			min = score[stairs-2];
		if(min > score[stairs-1])
			min = score[stairs-1];
		
		minSum += min;
		
		answer = totalSum - minSum;
		return answer;
	}
	
	public static void main(String[] args) {
		int stairs = 6;
		int[] score = {10, 20, 15, 25, 10, 20};
		
		int answer = solution(stairs, score);
		
		System.out.println(answer);
	}

}
