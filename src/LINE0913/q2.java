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
		
		//order�� ���� ��������
        for(int i=0; i<order.length; i++){
        	//���� ������ ������ �˻��Ͽ� ������
        	for(int j=0; j<waiting.size(); j++) {
        		if(waiting.get(j) == deque.peekFront()) {
        			result.add(deque.dequeFront());
        		}else if(waiting.get(j) == deque.peekRear()) {
        			result.add(deque.dequeRear());
        		}
        	}
        	
            if(order[i] == deque.peekFront()) { 	//�տ� �ְų�
            	result.add(deque.dequeFront());
            }else if(order[i] == deque.peekRear()) {//�ڿ� ������ ���� result �迭�� ����
            	result.add(deque.dequeRear());
            }else{									//������ �����ϰ� �������� �ٽ� ã��
            	waiting.add(order[i]);
            }
            
     
        }
        
        //result �迭 answer��
        answer = new int[order.length];
        //result.toArray(answer);
        for(int i=0; i<result.size(); i++) {
        	answer[i] = result.get(i);
        	System.out.println(answer[i]);
        }
        
       
	}
}

class IntDeque{
	int max; // ��(deck)�� �뷮
	int num; // ������ ������ ��
	int front; // �� �� Ŀ��
	int rear; // �� �� Ŀ��
	int[] que; // ��(deck)�� ��ü

	// ������ �� ���ܣ�ť�� ��� ����
	public class EmptyIntDequeException extends RuntimeException {
		public EmptyIntDequeException() {
		}
	}

	// ������ �� ���ܣ�ť�� ���� ��
	public class OverflowIntDequeException extends RuntimeException {
		public OverflowIntDequeException() {
		}
	}

	// ������
	public IntDeque(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max]; // ��(deck)��ü�� �迭�� ����
		} catch (OutOfMemoryError e) { // ������ �� �����ϴ�
			max = 0;
		}
	}

	// ��(deck)�� �����͸� �Ӹ��ʺ��� ��ť
	public int enqueFront(int x) throws OverflowIntDequeException {
		if (num >= max)
			throw new OverflowIntDequeException(); // ��(deck)�� ���� ��
		num++;
		if (--front < 0)
			front = max - 1;
		que[front] = x;
		return x;
	}

	// ��(deck)�� �����͸� �����ʺ��� ��ť
	public int enqueRear(int x) throws OverflowIntDequeException {
		if (num >= max)
			throw new OverflowIntDequeException(); // ��(deck)�� ���� ��
		que[rear++] = x;
		num++;
		if (rear == max)
			rear = 0;
		return x;
	}

	// ��(deck)�� �Ӹ����� �����͸� ��ť
	public int dequeFront() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException(); // ��(deck)�� ��� ����
		int x = que[front++];
		num--;
		if (front == max)
			front = 0;
		return x;
	}

	// ��(deck)�� �������� �����͸� ��ť
	public int dequeRear() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException(); // ��(deck)�� ��� ����
		num--;
		if (--rear < 0)
			rear = max - 1;
		return que[rear];
	}
	
	// ��(deck)�� �Ӹ����� �����͸� ��ũ(�Ӹ������͸� ���캽)
	public int peekFront() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException(); // ��(deck)�� ��� ����
		return que[front];
	}

	// ��(deck)�� �������� �����͸� ��ũ(���������͸� ���캽)
	public int peekRear() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException(); // ��(deck)�� ��� ����
		return que[rear == 0 ? max - 1 : rear - 1];
	}
}
