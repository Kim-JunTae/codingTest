package study_baekjoon;

public class �Լ�_�ܰ� {
//	//1065�� �Ѽ�
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
	//4673�� ���� �ѹ�
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
	
	//�� �ڸ����� ���ϴ� �Լ�
	public static void d(String number, boolean[] selfNumCheck) {
		int notSelfNum = Integer.parseInt(number);
		
		for(int i=0; i<number.length(); i++) {
			notSelfNum += Integer.parseInt(number.substring(i, i+1));
		}
		
		selfNumCheck[notSelfNum-1] = true;
	}

	
	//15596�� ���� N���� ��_�Լ�����
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
