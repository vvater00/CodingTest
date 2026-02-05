package week01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj_22864 {//피로도 문제

	public static void main(String[] args) throws Exception {
		int tired = 0;
		int work = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		for (int i = 0; i < 24; i++) {
			if(tired + a <= m) {
				tired = tired + a;
				work = work + b;
			}
			else
				tired = tired - c;
				if(tired < 0)
					tired = 0;
				
		}
		//System.out.print(work);
		bw.write(work+"");//++ 정수형을 문자형으로 변환
		bw.close();
		
		

	}

}
