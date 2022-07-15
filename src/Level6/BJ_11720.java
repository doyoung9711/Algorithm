package Level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_11720 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int result=0;
			//StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(br.readLine());
			String st = br.readLine();
			for(int i=0;i<N;i++) {
				result = result+st.charAt(i)-'0';
			}
			System.out.println(result);
			} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
