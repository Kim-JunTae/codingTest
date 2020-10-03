package study_baekjoon;

public class 계단오르기 {

	public static int solution(int stairs, int[] score){
		int answer = 0;
		
		//stairs가 1, 2, 3, 4이상일 때 나눠서 리턴
		if(stairs == 1)
			return score[0];
		
		if(stairs == 2)
			return score[0] + score[1];
		
		if(stairs == 3)
			if((score[0]+score[2]) >= (score[1]+score[2]))
				return score[0]+score[2];
			else
				return score[1]+score[2];
		
		//안해도 되지만 가독성 및 데이터가 음수값으로 들어올 것을 막기 위해서
		//+ stairs % 4 나머지가 1, 2, 3, 0 일때...
		if(stairs >= 4) {
			//4개의 계단을 그룹으로 생각하고
			//마지막 계단과 마지막 전 계단있는 그룹 제외(stairs, stair-1)
			for(int i=0; i<stairs-4; i+=4) {
				int min = score[i];
				int sum = score[i]+score[i+1]+score[i+2]+score[i+3];
				
				//4개의 값 중 가장 작은 수 찾기
				if(min > score[i+1])
					min = score[i+1];
				else if(min > score[i+2])
					min = score[i+2];
				else if(min > score[i+3])
					min = score[i+3];
				
				//합에서 가장 작은 수 빼기
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
