package stack_queue;

import java.util.ArrayList;
import java.util.List;

public class 다리를지나는트럭 {
	public static void main(String[] args) {
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = {10};
		
		int answer = 0;
		
		int truckWeightOnBridge = 0;
		int time = 0;
		
		List<Integer> trucks = new ArrayList<Integer>();
		for(int i=0; i<truck_weights.length; i++) {
			trucks.add(i, truck_weights[i]);
		}
		
		truckWeightOnBridge = trucks.get(0);
		
		for(int i=0; i<trucks.size(); i++) {
			if(i > 0)
				truckWeightOnBridge += trucks.get(i);
			
			if(truckWeightOnBridge <= weight) {
				//처음 트럭과 마지막 트럭의 다리 입장 시간의 차이
				time++;
				
				if(i == trucks.size()-1) {
					time += bridge_length;
				}
				
			}else{
				time += bridge_length+1;
				truckWeightOnBridge = trucks.get(i);
				break;
			}
		}
		
		answer = time;
		
		System.out.println(answer);
		
	}
}
