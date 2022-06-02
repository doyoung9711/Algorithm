package Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2577_STR {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] tmp = new int[10];
		try {
			int A = Integer.parseInt(br.readLine());
			int B = Integer.parseInt(br.readLine());
			int C = Integer.parseInt(br.readLine());
			br.close();
			int x = A*B*C;
			String str = String.valueOf(x);
			for(int i=0;i<str.length();i++) {
				tmp[str.charAt(i)-'0']++;
			}
			for(int v:tmp) {
				System.out.println(v);
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}