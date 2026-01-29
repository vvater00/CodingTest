package week01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj_21920 {//서로소 평균

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		double result = 0;
		int sum = 0;
		int count = 0;
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int [] a = new int [n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		int x = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			if(x >= a[i]) {
				if(UCL(x, a[i]) == 1) {
					sum += a[i];
					count++;
				}
			}
			if(x < a[i]) {
				if(UCL(a[i], x) == 1) {
					sum += a[i];
					count++;
				}
			}
		}
		result = sum / count;
		bw.write(result+"");
		bw.close();
		

	}
	public static int UCL(int a, int b) {
		if(b == 0)
			return a;
		return UCL(b, a%b);
	}

}
