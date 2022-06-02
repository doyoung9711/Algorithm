package Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2439 {

	public static void main(String[] args) {
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		for(int i=0;i<N;i++) {
			for(int j=N;j>i+1;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
