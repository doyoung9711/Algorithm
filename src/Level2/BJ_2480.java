package Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2480 {
	
	

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			br.close();
			if(A==B&&B==C) {
				System.out.println(10000+(A*1000));
			}
			else {
				if(A==B) {
					System.out.println(1000+(A*100));
				}
				else if(B==C) {
					System.out.println(1000+(B*100));	
				}
				else if(A==C) {
					System.out.println(1000+(A*100));
				}
				else {
					System.out.println(find_Max(A,B,C)*100);
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	static int find_Max(int a, int b, int c) {
		int temp = (a>b) ? a:b;
		int max = (temp>c)? temp:c;
		return max;
	}

}
