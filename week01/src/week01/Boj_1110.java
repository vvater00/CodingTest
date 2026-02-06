package week01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj_1110 {//더하기 사이클 문제

	public static void main(String[] args) throws IOException{
		int count = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int m;
		int OG = n;
		while (true) {
			m = (n % 10)*10 + (((n % 10) + (n / 10)) % 10);
			count++;
			if (m == OG)
				break;
			n = m;
			
		}
		bw.write(count+"");
		bw.close();

	}

}
