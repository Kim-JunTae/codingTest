package LINE0913;

public class q1 {
	public static void main(String[] args) {
		int[][] boxes = {{1, 2}, {2, 1}, {3, 3}, {4, 5}, {5, 6}, {7, 8}};
		
		int answer = 0;
		
		for(int i=0; i<boxes.length; i++){		// 상자 하나씩 조사
			if(boxes[i][0] == boxes[i][1]){		// 상자의 상품이 동일할 때는 다음 상자 개봉
				
			}else{								// 상자의 상품이 다를 때는 다른 상자 상품 찾기
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
