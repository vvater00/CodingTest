package week01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj_5618 {//공약수 문제

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		if (n == 2) {
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			for (int i = 1; i <= Math.min(a, b); i++) {
				if (a % i == 0 && b % i == 0)
					bw.write(i+""+"\n");
			}
		}
		else {
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			for ( int i = 1; i <= Math.min(a, Math.min(b,c)); i++) {
				if (a % i == 0 && b % i == 0 && c % i == 0)
					bw.write(i+""+"\n");
			}
		}
		bw.close();

	}

}
