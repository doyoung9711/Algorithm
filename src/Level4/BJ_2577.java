package Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2577 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] tmp = new int[10];
		try {
			int A = Integer.parseInt(br.readLine());
			int B = Integer.parseInt(br.readLine());
			int C = Integer.parseInt(br.readLine());
			br.close();
			int x = A*B*C;
			while(x!=0) {
				tmp[x%10]++;
				x=x/10;
				
			}
			for(int v:tmp) {
				System.out.println(v);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
