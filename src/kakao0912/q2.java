package kakao0912;

public class q2 {
	public static void main(String[] args) {
		String[] answer = {};
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course = 	{2,3,4};
		
		
	}
	
	//course�� ������ ��ǰ�޴� �������� �ϳ��� �޾Ƽ�
//    public String[] solution(String[] orders, int[] course) {
//    	String[] answer;
//    	
//    	for(int i = 0; i<course.length; i++) {
//    		int menuCount = course[i];
//    		String menu = "";
//    		
//    		//�� �մԵ� �ֹ� ����
//    		for(int j = 0; j<course.length; j++) {
//    			//�մ��� �ֹ��� ��ǰ �������� ���ռ��� ���� ���� ���� ����
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
