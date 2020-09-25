package stack_queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class 프린터2 {
	public static void main(String[] args) {
		int answer = 0;
		//대기 목록에 있는 문서의 중요도가 순서대로 담긴 배열
		int[] priorities = {2, 1, 3, 2};
		//내가 인쇄 요청한 문서의 현재 대기목록 위치
		int location = 2;
		
		//배열을 연결리스트 형태로.
		List<Integer> list = new LinkedList<Integer>();
		for(int i=0; i<priorities.length; i++) {
			list.add(priorities[i]);
		}
		
		//원본 배열 오름차순 정렬
		Arrays.sort(priorities);
		//현재 가장 앞에 있는 숫자의 인덱스
		int index = 0; 
		//출력 횟수
		int count = 0;
		
		while(list.size() > 0) {
			//인덱스 범위 조절(0~list.size)
			if(index==list.size()) {
				index=0;
			}
			
			//현재 인덱스의 숫자가 배열의 가장 마지막 값과 같다면 출력해도 되는 가장 큰값
			if(list.get(index) == priorities[priorities.length-1-count]) {
				count++;
				if(index==location) {
					break;
				}else if(index < location){
					location--;
				}
				
				list.remove(index);
			}else{
			//아니라면 index만 이동
				if(index == list.size()-1) {
					index = 0;
				}else{
					index++;
				}
			}
		}
		answer = count;
		System.out.println(answer);
	}
}
