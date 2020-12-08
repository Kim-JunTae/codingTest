package study_baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 수학1_단계 {
	//손익 분기점
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String request = br.readLine();
		String[] firstLine = request.split(" ");
		
		int A = Integer.parseInt(firstLine[0]);
		int B = Integer.parseInt(firstLine[1]);
		int C = Integer.parseInt(firstLine[2]);
		
		int notebook = 1;
		int total_cost = A+B*notebook;
		int break_even_point = C*notebook - total_cost;
		
		if(B-C < 0) {
			bw.write("-1");
		}else{
			while(break_even_point < 0) {
				break_even_point = (C-B)*notebook - B;
				notebook++;
			}
			bw.write(notebook);
		}
		
		bw.flush();
		bw.close();		
	}

}
