package study_baekjoon;

public class 함수_단계 {
//	//1065번 한수
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
	//4673번 셀프 넘버
	public static void main(String[] args) {
		boolean[] selfNumCheck = new boolean[10000];
		
		for(int i=1; i<=10000; i++) {
			String number = Integer.toString(i);
			d(number, selfNumCheck);
		}
		
		for(int i=0; i<10000; i++) {
			if(!selfNumCheck[i]) {
				System.out.println(selfNumCheck[i]);
			}
		}
	}
	
	//각 자리수를 더하는 함수
	public static void d(String number, boolean[] selfNumCheck) {
		int notSelfNum = Integer.parseInt(number);
		
		for(int i=0; i<number.length(); i++) {
			notSelfNum += Integer.parseInt(number.substring(i, i+1));
		}
		
		selfNumCheck[notSelfNum-1] = true;
	}

	
	//15596번 정수 N개의 합_함수구현
//	public long sum(int[] a) {
//		long sum = 0;
//		
//		for(int i=0; i<a.length; i++) {
//			sum += a[i];
//		}
//		
//		return sum;
//	}
	
}
