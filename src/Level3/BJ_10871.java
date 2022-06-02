package Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10871 {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int X = Integer.parseInt(st.nextToken());
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int[] array = new int[N];
			for(int i=0;i<N;i++) {
				array[i] = Integer.parseInt(st1.nextToken());
			}
			for(int i=0; i<N; i++) {
				if(array[i]<X) {
					System.out.print(array[i]+" ");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
