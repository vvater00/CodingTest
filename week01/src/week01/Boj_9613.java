package week01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj_9613 {//GCD 합 문제 (최대공약수 합 문제)

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int sum = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int [] a = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = Integer.parseInt(st.nextToken());
			}
			for (int j = 0; j < n; j++) {
				for (int k = j+1; k < n; k ++) {
					sum += UCL(Math.max(a[j], a[k]), Math.min(a[j], a[k]));
				}
			}
			bw.write(sum+""+"\n");
		}
		bw.close();

	}
	
	public static int UCL(int a, int b) {
		if(b == 0)
			return a;
		return UCL(b, a%b);
	}

}
