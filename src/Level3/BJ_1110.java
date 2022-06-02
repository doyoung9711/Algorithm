package Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1110 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int N = Integer.parseInt(br.readLine());
			br.close();
			int i=0;
			int x=N;
			int a=0,b=0;
			do {
				i++;
				a=(x/10+x%10)%10;
				b=x%10;
				x=b*10+a;
			}while(N!=x);
			System.out.println(i);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
