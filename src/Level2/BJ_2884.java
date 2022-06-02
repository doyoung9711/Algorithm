package Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2884 {

	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			br.close();
				if(M>=45 && M<=59) {
					System.out.println(H+" "+(M-45));
				}
				else {
					if(H>=1&&H<=23) {
						System.out.println((H-1)+" "+(60-(45-M)));

					}
					else
						System.out.println(23+" "+(60-(45-M)));						
				}
							
		}catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
