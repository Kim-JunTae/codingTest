package leetcode;

public class MultipleString {

	public static void main(String[] args) {
		String num1 = "123456789";
		String num2 = "987654321";
		
		String answer = multiply(num1, num2);
		
		System.out.println(answer);
	}
	
	public static String multiply(String num1, String num2) {
		double sum = 0;
		
		int lengthNum1 = num1.length();
		int lengthNum2 = num2.length();
		
		double[] numbers1 = new double[lengthNum1];
		double[] numbers2 = new double[lengthNum2];
		
		for(int i=0; i<lengthNum1; i++) {
			numbers1[i] = (double) (Integer.parseInt(num1.substring(i, i+1))*Math.pow(10, lengthNum1-i-1));
		}
		
		for(int i=0; i<lengthNum2; i++) {
			numbers2[i] = (double) (Integer.parseInt(num2.substring(i, i+1))*Math.pow(10, lengthNum2-i-1));
		}
		
		for(int i=0; i<lengthNum1; i++) {
			for(int j=0; j<lengthNum2; j++) {
				sum += numbers1[i]*numbers2[j];
			}
		}
		//long answer = (long) sum;
		long answer = (long) Math.floor(sum);
		return String.valueOf(answer);
	}

}
