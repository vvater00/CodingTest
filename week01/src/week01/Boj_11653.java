package week01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 한번 더보기 !!!!
public class Boj_11653 {//소인수분해 문제 

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb =new StringBuilder();
		int n = Integer.parseInt(br.readLine()); 
		for (int i = 2; i <= Math.sqrt(n); i++) {
			while(n % i == 0) {
				n /= i;
				sb.append(i).append("\n");
			}
		}
		if (n != 1) {
			sb.append(n);
		}
		bw.write(sb+"");
		bw.close();

	}

}
