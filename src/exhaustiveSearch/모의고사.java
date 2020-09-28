package exhaustiveSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 모의고사 {
	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		
		//각 수포자들의 배열
		int[][] supoMember = new int[][] {{1,2,3,4,5},
										  {2,1,2,3,2,4,2,5},
										  {3,3,1,1,2,2,4,4,5,5}};
		
		//답안지 비교
		int[] result = new int[3];
		for(int i=0; i<answers.length; i++) {
			for(int j=0; j<3; j++) {
				if(answers[i] == supoMember[j][i%supoMember[j].length]){
					result[j]++;
				}
			}
		}
		
		//최대값 찾기
		int max = 0;
		for(int i=0; i<3; i++) {
			if(result[i] > max) {
				max = result[i];
			}
		}
		
		//최대값이 0이면 다 0점
		if(max == 0) {
			System.out.println(new int[]{});
		}
		
		//최대값과 같은 값을 가진 인덱스 추출
		List<Integer> winner = new ArrayList<Integer>();
		for(int i=0; i<3; i++) {
			if(result[i] == max) {
				winner.add(i);
			}
		}
		
		//최종 배열 생성 및 정렬 후 리턴
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

