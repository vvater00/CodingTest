package week01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj_2745 {//진법 변환 문제

	public static void main(String[] args) throws IOException {
		int result = 0;
		int digit = 1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String n = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		char [] c = n.toCharArray();
		//n.charAt(0);
		for (int i = n.length() - 1; i >=0; i--) {
			if (c[i] >= 'A' && c[i] <= 'Z') {
				result += (int)(c[i] - 'A' + 10) * digit;
			}
			else
				result += (int)(c[i] - '0')  * digit;
			digit *= b; 
		}
		bw.write(result+"");
		//System.out.print(result);
		bw.close();

	}

}
