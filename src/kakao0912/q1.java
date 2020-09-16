package kakao0912;

public class q1 {
	public static void main(String[] args) {
		//String new_id = "...!@BaT#*..y.abcdefghijklm";
		//String new_id = "    ";
		String new_id = "z-+.^.";
		
		new_id = getLowerCase(new_id);
		System.out.println(new_id);
		
		new_id = checkRegex(new_id);
		System.out.println(new_id);
	
		new_id = checkPeriod(new_id);
		System.out.println(new_id);
		
		new_id = checkBothEndsPeriod(new_id);
		System.out.println(new_id);
		
		new_id = checkEmpty(new_id);
		System.out.println(new_id);
		
		new_id = checkOverLength(new_id);
		System.out.println(new_id);
		
		new_id = checkLessLength(new_id);
		System.out.println(new_id);
	}
	
	//1�ܰ�
	public static String getLowerCase(String new_id){
        return new_id.toLowerCase();
    }
	
	//2�ܰ� : ����ǥ���� + replaceAll
    public static String checkRegex(String new_id){
        //2-1 : ����ǥ���� ���� ���ĺ� �ҹ���, ����, ����, ����, ��ħǥ
        String regex = "[^a-z0-9-_.]+";
        
        //2-2 : replaceAll
        return new_id.replaceAll(regex, "");
    }
	
    //3�ܰ� : ��ħǥ ������ �� ��ħǥ �ϳ��� ġȯ
    public static String checkPeriod(String new_id) {
    	String responseStr = "";
    	String requestStr = new_id;
    	
    	for(int i=0; i<requestStr.length(); i++) {
    		if(new_id.charAt(i) == '.') {
    			if(i != requestStr.length()-1){
                    if(new_id.charAt(i+1) != '.') {
                        responseStr = responseStr + requestStr.charAt(i);
                    }
                }
    		}else{
    			responseStr = responseStr + requestStr.charAt(i);
    		}
    	}
    	return responseStr;
    }
    
    //4�ܰ� : ��ħǥ ó���� ���� ��ġ���� �� ����
    public static String checkBothEndsPeriod(String new_id) {
    	String response = new_id;
    	if(!response.isEmpty() && new_id != null) {
	    	if(response.charAt(response.length()-1) == '.')
	    		response = response.substring(0,response.length()-1);
	    	
	    	if(response.charAt(0) == '.')
	    		response = response.substring(1,response.length());
    	}
    	return response;
    }
    
    //5�ܰ� : �� ���ڿ��� ��� "a"
    public static String checkEmpty(String new_id) {
    	if(new_id.isEmpty() || new_id == null) {
    		return "a";
    	}else {
    		return new_id;
    	}
    }
    
    //6�ܰ� : ���� Ȯ��(15�� �ʰ�)�Ͽ� substing(0,15) �� 4�ܰ� ����
	public static String checkOverLength(String new_id){
	    String response = new_id;
	    
	    if(!response.isEmpty() || response != null) {
	        if(response.length() > 15){
	            response = response.substring(0,15);
	        }
	    }
	    //�� ���� ��ħǥ üũ
	    response = checkBothEndsPeriod(response);
	    
	    return response;
	}
	
	//7�ܰ� : ���� Ȯ��(2�� ����)�Ͽ� ������ ���ڸ� �ϳ� �߰��Ͽ� ���� 3�� �ɶ����� �ݺ�
	public static String checkLessLength(String new_id){
		//5�ܰ�� ������ ����� �޼��� : �ڵ��׽�Ʈ������ �ݿ� X
		String response = new_id;
		while(response.length() < 3) {
			response = response + response.charAt(response.length()-1);
		}
		
		return response;
	}
    
}
