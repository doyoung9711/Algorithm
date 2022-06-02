package Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2525 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(br.readLine());
			br.close();
			int C_hour = C/60;
			int C_minute = C%60;
			if(B+C_minute<=59) {
				if(A+C_hour<=23) {
				System.out.println((A+C_hour)+" "+(B+C_minute));
				}
				else {
					System.out.println((A+C_hour-24)+" "+(B+C_minute));
				}
			}
			else {
				if(A+C_hour+1<=23) {
					System.out.println((A+C_hour+1)+" "+((B+C_minute)-60));
				}
				else {
					System.out.println((A+C_hour+1-24)+" "+((B+C_minute)-60));	
				}
				
			}
	
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
