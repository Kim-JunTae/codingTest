package kakao0912;

public class q2 {
	public static void main(String[] args) {
		String[] answer = {};
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course = 	{2,3,4};
		
		
	}
	
	//course를 구성할 단품메뉴 갯수들을 하나씩 받아서
//    public String[] solution(String[] orders, int[] course) {
//    	String[] answer;
//    	
//    	for(int i = 0; i<course.length; i++) {
//    		int menuCount = course[i];
//    		String menu = "";
//    		
//    		//각 손님들 주문 상태
//    		for(int j = 0; j<course.length; j++) {
//    			//손님이 주문한 단품 갯수보다 조합수가 적을 때만 조합 생성
//    			if(orders[j].length() >= menuCount) {
//    				
//    				for(int k=0; k<menuCount; k++) {
//    					menu += orders[j].charAt(k);
//    					
//    					
//    				}
//    			}
//    		}
//    	}
//    	
//    }
    
    class CourseMenu implements Comparable<CourseMenu>{
    	String menu;
    	int count;
    	
    	CourseMenu(String menu){
    		this.menu = menu;
    		this.count = 1;
    	}

		@Override
		public int compareTo(CourseMenu o) {
			if(this.menu == o.menu) {
				return this.count++;
			}else {
				return this.count = 1;
			}
		}
    }
	
}
