package Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10818 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i<N; i++) {	
				arr[i]=Integer.parseInt(st.nextToken());			
			}
			System.out.println(min(arr,N)+" "+max(arr, N));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	//최대값
	static int max(int[] arr, int N) {
		int result = Integer.MIN_VALUE;
		for(int i=0;i<N;i++) {
			if(arr[i]>result) {
				result = arr[i];
			}
		}
		return result;
	}
	//최소값
	static int min(int[] arr, int N) {
		int result = Integer.MAX_VALUE;
		for(int i=0;i<N;i++) {
			if(arr[i]<result) {
				result = arr[i];
			}
		}
		return result;
	}
}
