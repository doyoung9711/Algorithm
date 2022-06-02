package Level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1065 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int N = Integer.parseInt(br.readLine());
			int count=0;
			for(int i=1;i<=N;i++) {
				if(i<100) {
					count ++;
				}
				else {	
					int d1=(i/10)%10-(i%10);
					int d2=(i/100)-(i/10)%10;
					if(d1==d2)
						count++;
						
				}
			}
			System.out.println(count);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
