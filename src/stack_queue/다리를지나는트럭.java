package stack_queue;

import java.util.ArrayList;
import java.util.List;

public class �ٸ���������Ʈ�� {
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
				//ó�� Ʈ���� ������ Ʈ���� �ٸ� ���� �ð��� ����
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
