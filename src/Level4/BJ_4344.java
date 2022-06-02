package Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_4344 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int [] arr = new int[1000];
			int C = Integer.parseInt(br.readLine());
			
			for(int i=0;i<C;i++) {
				int sum = 0, count=0;
				StringTokenizer st = new StringTokenizer(br.readLine());
				int N = Integer.parseInt(st.nextToken());
				for(int j=0;j<N;j++) {
					arr[j]=Integer.parseInt(st.nextToken());
					sum = sum+arr[j];
				}
				double avg = (double)sum/N;
				for(int k=0;k<N;k++) {
					if(arr[k]>avg) {
						count++;
					}
				}
				System.out.print(String.format("%.3f)", (double)count/N*100));
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
