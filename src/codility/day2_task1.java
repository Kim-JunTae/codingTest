package codility;

public class day2_task1 {

	public static void main(String[] args) {
		int[] A = {3, 8, 9, 7, 6};
		int K = 3;
		
		int[] answer = solution(A, K);
		
		System.out.println(answer);
	}

	private static int[] solution(int[] A, int K) {
		int LengthA = A.length;

        int[] answer = new int[LengthA];

        if(LengthA == K){
            return A;
        }


        if(K > LengthA) {
			int count = K%LengthA;
			for(int i=0; i<LengthA-1; i++) {
				if((i+count) < LengthA)
					answer[i] = A[i+count];
				else
					answer[i] = A[LengthA-i-count];
			}
		}else{			
            int count = 0;

			for(int i=0; i<LengthA; i++) {
				if((i+K) <= LengthA)
					answer[i] = A[i+K-1];
				else
					answer[i] = A[count++];
			}
		}
		
		return answer;
	}

	public int[] solution2(int[] A, int K) {
        int length = A.length;
        int count;
        int[] answer = new int[length];
        int temp = 0;

        if(length == K){
            return A;
        }

        if(K > length){
            count = K%length;
        }else{
            count = K;
        }

        for(int i=0; i<length; i++){
            if(i+count <= length)
                answer[i] = A[i+count-1];
            else
                answer[i] = A[temp++];
        }

        return answer;
    }
}
