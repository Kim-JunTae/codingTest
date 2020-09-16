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
	
	//1단계
	public static String getLowerCase(String new_id){
        return new_id.toLowerCase();
    }
	
	//2단계 : 정규표현식 + replaceAll
    public static String checkRegex(String new_id){
        //2-1 : 정규표현식 정의 알파벳 소문자, 숫자, 빼기, 밑줄, 마침표
        String regex = "[^a-z0-9-_.]+";
        
        //2-2 : replaceAll
        return new_id.replaceAll(regex, "");
    }
	
    //3단계 : 마침표 연속일 때 마침표 하나로 치환
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
    
    //4단계 : 마침표 처음과 끝에 위치했을 때 제거
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
    
    //5단계 : 빈 문자열일 경우 "a"
    public static String checkEmpty(String new_id) {
    	if(new_id.isEmpty() || new_id == null) {
    		return "a";
    	}else {
    		return new_id;
    	}
    }
    
    //6단계 : 길이 확인(15자 초과)하여 substing(0,15) 후 4단계 실행
	public static String checkOverLength(String new_id){
	    String response = new_id;
	    
	    if(!response.isEmpty() || response != null) {
	        if(response.length() > 15){
	            response = response.substring(0,15);
	        }
	    }
	    //양 끝에 마침표 체크
	    response = checkBothEndsPeriod(response);
	    
	    return response;
	}
	
	//7단계 : 길이 확인(2자 이하)하여 마지막 문자를 하나 추가하여 길이 3이 될때까지 반복
	public static String checkLessLength(String new_id){
		//5단계와 연관이 생기는 메서드 : 코딩테스트에서는 반영 X
		String response = new_id;
		while(response.length() < 3) {
			response = response + response.charAt(response.length()-1);
		}
		
		return response;
	}
    
}
