package bfs_dfs;

import java.util.ArrayList;
import java.util.List;

public class �ܾȯ {

	static int answer = 0;
	
	public static void main(String[] args) {
		String begin = "hit";
		String target = "cog";
		String[] words = {"hot","dot","dog","lot","log","cog"};
		
		boolean check = false;
		//target�� ���� ���
		for(String word : words) {
			if(word.equals(target)) {
				check = true;
				break;
			}
		}
		
		if(!check) {
			System.out.println(answer);
			//return 0;
		}
		
		List<String> queue = new ArrayList<>();
		queue.add(begin);
		
		int depth = 0;
		boolean chk = false;
		
		//bfs
		while(queue.size() != 0 && depth <= words.length) {
			//���� queue�� ����ִ� ť
			int size = queue.size();
			for(int i=0; i<size; i++) {
				for(int j=0; j<words.length; j++) {
					//���ڿ� �ٸ� ����
					int diff = compareWords(queue.get(0), words[j]);
					
					//�ѱ��ڸ� �ٸ� ���
					if(diff == 1) {
						if(words[j].equals(target)) {
							depth++;
							chk = true;
							break;
						}else{
							queue.add(words[j]);
						}
					}
				}
				
				if(chk){
					break;
				}
				queue.remove(0);
			}
			
			if(chk){
				break;
			}
			depth++;
		}
		//return depth;
		answer = depth;
		System.out.println(answer);
	}
	
	public static int compareWords(String word1, String word2) {
		int length = word1.length();
		int diff = 0;
		for(int i=0; i<length; i++) {
			if(word1.charAt(i) != word2.charAt(i)) {
				diff++;
			}
		}
		return diff;
	}
	
//	public static int solution(String begin, String target, String[] words) {
//        int answer = 0;
//        boolean[] visit = new boolean[words.length];
//        
//        //1. target�� word�� ������
//        if(targetCheck(target, words)){
//           compareWords(begin, target, words, visit);     
//           answer=result;
//        }
//        
//        
//        return answer;
//    }
//    
//    //begin�� words[]
//    public static void compareWords(String begin, String target, String[] words, boolean[] visit){
//        int count = 0;
//    	String changeWord = "";
//        
//    	for(int i=0; i<words.length; i++){
//    		for(int j=0; j<begin.length(); j++){
//    			if(begin.charAt(j) != words[i].charAt(j)) {
//    				count++;
//    			}
//    		}
//    		//���� �ٲ� �ܾ�� �ϳ��� �ٸ��ٸ� �ٲ���.
//    		if(count == 1 && !visit[i]) {
//    			changeWord = words[i];
//    			result++;
//    			break;
//    		}
//    	}
//        
//    	//target�� ������ Ȯ��
//    	if(!changeWord.equals(target)) {
//    		compareWords(changeWord, target, words, visit);
//    	}
//        
//    }
//    
//    //target�� words�� �ִ��� Ȯ��
//    public static boolean targetCheck(String target, String[] words){
//        for(int i=0; i<words.length; i++){
//            if(words[i].equals(target)){
//                return true;
//            }
//        }
//        return false;
//    }

}
