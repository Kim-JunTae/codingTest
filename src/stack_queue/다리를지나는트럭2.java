package stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭2 {
	public static void main(String[] args) {
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = {10};
		
		int answer = 0;
		
		int TotalWeight = 0;
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int truck_weight : truck_weights) {
			while(true) {
				if(queue.isEmpty()) {
					queue.add(truck_weight);
					TotalWeight += truck_weight;
					answer++;
					break;
				} else if(queue.size() == bridge_length) {
					TotalWeight -= queue.poll();
				} else {
					if(TotalWeight + truck_weight > weight) {
						answer++;
						queue.add(0);
					} else {
						queue.add(truck_weight);
						TotalWeight += truck_weight;
						answer++;
						break;
					}
				}
			}
		}
		
		answer += bridge_length;
		
		System.out.println(answer);
		
	}
}
