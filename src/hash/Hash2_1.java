package hash;

public class Hash2_1 {
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        //1. ���� �� ��Ҹ� �迭ȭ
        //2. ���̰� ���� �迭�� ��ҵ��� ���̸�ŭ 
        //   �տ������� ��(subString)������
        //   �����ϸ� answer = false;
        int index;
        
        for(int i=0; i<phone_book.length-1; i++) {
        	for(int j=i+1; j<phone_book.length; j++) {
	        	if(phone_book[i].length() > phone_book[j].length()) {
	        		index=phone_book[j].length();
	        		
	        		if(phone_book[i].substring(0, index).equals(phone_book[j])) {
	        			return false;
	        		}
	        		
	        	}else{
	        		index=phone_book[i].length();
	        		if(phone_book[i].equals(phone_book[j].substring(0, index))) {
	        			return false;
	        		}
	        	}
        	}
        }
        
        return answer;
    }
}
