package LINE0913;

import java.util.ArrayList;
import java.util.List;

public class q2 {
	public static void main(String[] args) {
		int[] answer = {};
		//int[] ball = {1,2,3,4,5,6};
		//int[] order = {6,2,5,1,4,3};
		int[] ball = {11, 2, 9, 13, 24};
		int[] order = {9, 2, 13, 24, 11};
		IntDeque deque = new IntDeque(ball.length);
		
		for(int i=0; i<ball.length; i++) {
			deque.enqueFront(ball[i]);
		}
		
		List<Integer> result = new ArrayList<Integer>();
		List<Integer> waiting = new ArrayList<Integer>();
		
		//order에 따라 공뺴오기
        for(int i=0; i<order.length; i++){
        	//보류 상태인 공부터 검색하여 나오기
        	for(int j=0; j<waiting.size(); j++) {
        		if(waiting.get(j) == deque.peekFront()) {
        			result.add(deque.dequeFront());
        		}else if(waiting.get(j) == deque.peekRear()) {
        			result.add(deque.dequeRear());
        		}
        	}
        	
            if(order[i] == deque.peekFront()) { 	//앞에 있거나
            	result.add(deque.dequeFront());
            }else if(order[i] == deque.peekRear()) {//뒤에 있으면 뺴서 result 배열에 넣음
            	result.add(deque.dequeRear());
            }else{									//없으면 저장하고 다음번에 다시 찾기
            	waiting.add(order[i]);
            }
            
     
        }
        
        //result 배열 answer로
        answer = new int[order.length];
        //result.toArray(answer);
        for(int i=0; i<result.size(); i++) {
        	answer[i] = result.get(i);
        	System.out.println(answer[i]);
        }
        
       
	}
}

class IntDeque{
	int max; // 덱(deck)의 용량
	int num; // 현재의 데이터 수
	int front; // 맨 앞 커서
	int rear; // 맨 뒤 커서
	int[] que; // 덱(deck)의 본체

	// 실행할 때 예외：큐가 비어 있음
	public class EmptyIntDequeException extends RuntimeException {
		public EmptyIntDequeException() {
		}
	}

	// 실행할 때 예외：큐가 가득 참
	public class OverflowIntDequeException extends RuntimeException {
		public OverflowIntDequeException() {
		}
	}

	// 생성자
	public IntDeque(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max]; // 덱(deck)본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없습니다
			max = 0;
		}
	}

	// 덱(deck)에 데이터를 머리쪽부터 인큐
	public int enqueFront(int x) throws OverflowIntDequeException {
		if (num >= max)
			throw new OverflowIntDequeException(); // 덱(deck)이 가득 참
		num++;
		if (--front < 0)
			front = max - 1;
		que[front] = x;
		return x;
	}

	// 덱(deck)에 데이터를 꼬리쪽부터 인큐
	public int enqueRear(int x) throws OverflowIntDequeException {
		if (num >= max)
			throw new OverflowIntDequeException(); // 덱(deck)은 가득 참
		que[rear++] = x;
		num++;
		if (rear == max)
			rear = 0;
		return x;
	}

	// 덱(deck)의 머리부터 데이터를 디큐
	public int dequeFront() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException(); // 덱(deck)이 비어 있음
		int x = que[front++];
		num--;
		if (front == max)
			front = 0;
		return x;
	}

	// 덱(deck)의 꼬리부터 데이터를 디큐
	public int dequeRear() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException(); // 덱(deck)이 비어 있음
		num--;
		if (--rear < 0)
			rear = max - 1;
		return que[rear];
	}
	
	// 덱(deck)의 머리부터 데이터를 피크(머리데이터를 살펴봄)
	public int peekFront() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException(); // 덱(deck)이 비어 있음
		return que[front];
	}

	// 덱(deck)의 꼬리부터 데이터를 피크(꼬리데이터를 살펴봄)
	public int peekRear() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException(); // 덱(deck)이 비어 있음
		return que[rear == 0 ? max - 1 : rear - 1];
	}
}
