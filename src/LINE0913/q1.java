package LINE0913;

public class q1 {
	public static void main(String[] args) {
		int[][] boxes = {{1, 2}, {2, 1}, {3, 3}, {4, 5}, {5, 6}, {7, 8}};
		
		int answer = 0;
		
		for(int i=0; i<boxes.length; i++){		// ���� �ϳ��� ����
			if(boxes[i][0] == boxes[i][1]){		// ������ ��ǰ�� ������ ���� ���� ���� ����
				
			}else{								// ������ ��ǰ�� �ٸ� ���� �ٸ� ���� ��ǰ ã��
				for(int j=i+1; j<boxes.length; j++){
					int box10 = boxes[i][0];
					int box11 = boxes[i][1];
					int box20 = boxes[j][0];
					int box21 = boxes[j][1];
					
					if(box10 == box20){
						boxes[i][1] = box20;
						boxes[j][0] = box11;
						
					}else if(box10 == box21){
						boxes[i][1] = box21;
						boxes[j][1] = box11;
						
					}else if(box11 == box20){
						boxes[i][0] = box20;
						boxes[j][0] = box10;
						
					}else if(box11 == box21){
						boxes[i][0] = box21;
						boxes[j][1] = box10;
					}
					System.out.println(j);
				}
			}
		}
		
		for(int i=0; i<boxes.length; i++){
			//System.out.println("1 : " +boxes[i][0] +" 2 :" + boxes[i][1]);
			if(boxes[i][0] != boxes[i][1]){
				answer++;
			}
		}
		
		System.out.println(answer);
	}
	
	
}
