package Level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2675 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int N = Integer.parseInt(br.readLine());
			String[] result = new String[N];
			for(int i=0;i<N;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				String ex = new String();
				ex=st.nextToken();
				result[i]="";
				
				for(int k=0;k<ex.length();k++) {
				for(int j=0;j<x;j++) {
					result[i]=result[i]+ex.charAt(k);
				}
			}
			}
				
			for(int i=0;i<N;i++) {
				System.out.println(result[i]);
			}
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
