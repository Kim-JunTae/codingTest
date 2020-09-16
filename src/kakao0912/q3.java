package kakao0912;

import java.util.ArrayList;
import java.util.List;

//출력크기 초과? : 자료구조를 다르게 해야될 것 같다.
public class q3 {
	public static void main(String[] args) {
		String[] info = {"java backend junior pizza 150",
					     "python frontend senior chicken 210",
					     "python frontend senior chicken 150",
					     "cpp backend senior pizza 260",
					     "java backend junior chicken 80",
		                 "python backend senior chicken 50"};
		
		String[] query = {"java and backend and junior and pizza 100",
						  "python and frontend and senior and chicken 200",
						  "cpp and - and senior and pizza 250",
						  "- and backend and senior and - 150",
						  "- and - and - and chicken 100",
						  "- and - and - and - 150"};
		
		int[] answer = new int[query.length];
		
		List<String[]> VList = new ArrayList<String[]>();
		
		for(int i = 0; i<info.length; i++){
            String[] volunteer = info[i].split(" ");
            VList.add(volunteer);
        }
	    
		List<String[]> QList = new ArrayList<String[]>();
		
	    for(int j = 0; j<query.length; j++){
	        String[] question = query[j].split(" and ");
	        String soulFood = question[3].split(" ")[0];
	        String score = question[3].split(" ")[1];
	        
	        String[] add = {question[0], question[1], question[2], soulFood, score};
	        QList.add(add);
	    }
	   //질문 돌리기 
	   for(int i=0; i<QList.size(); i++) {
		   //한 질문에 사람 돌리기
		   for(int j=0; j<VList.size(); j++) {
			   //두 리스트 데이터 돌리기
			   for(int k=0; k<5; k++) {
				   String vData = VList.get(j)[k];
				   String qData = QList.get(i)[k];
				   System.out.println(vData + " " + qData);
				   if(k<4){
					   if(!qData.equals("-")) {
						   if(!vData.equals(qData)) {
							   break;
						   }
					   }
				   }else{
					   if(qData.equals("-")) {
						   answer[i]++;
					   }else if(Integer.parseInt(vData) >= Integer.parseInt(qData)){
						   answer[i]++;
					   }
				   }
			   }
		   }
	   }
	    
	    
//	    for(int i=0; i<query.length; i++) {
//	    	boolean check = false;
//	    	
//	    	while(!check){
//	    		int j = 0;
//	    		    			
//	    		if(j>4)	check = true;
//	    		
//	    		if(j==4) {
//	    			if(Integer.parseInt(QList.get(i)[j]) <= Integer.parseInt(VList.get(i)[j])){
//	    				answer[j]++;
//	    			}
//	    		}
//	    		
//	    		if(!QList.get(i)[j].equals("-")) {
//		    		if(QList.get(i)[j].equals(VList.get(i)[j])){
//		    			j++;
//		    		}else{
//		    			check = true;
//		    		}
//		    	}else{
//		    		j++;
//		    	}
//	    	}
//	    }
	    
//	    for(int k = 0; k<query.length; k++){
//        	// - 일때는 고려 안함...
//        	if(list.get(k)[0].equals(question[0]) || question[0].equals("-")){
//        		if(list.get(k)[1].equals(question[1]) || question[1].equals("-")) {
//        			if(list.get(k)[2].equals(question[2]) || question[2].equals("-")) {
//        				if(list.get(k)[3].equals(soulFood) || soulFood.equals("-")) {
//        					if(Integer.parseInt(list.get(k)[4]) >= Integer.parseInt(score)|| score.equals("-")) {
//        						answer[j]++; 
//        					}
//        				}
//        			}
//        		}
//        	}
//        }
	    
	    
		System.out.println(answer[0]+","+answer[1]+","+answer[2]+","+answer[3]+","+answer[4]+","+answer[5]); 
	}

}
