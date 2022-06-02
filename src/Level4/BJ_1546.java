package Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1546 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int N = Integer.parseInt(br.readLine());
			int [] arr = new int[N];
			double[] arr_double = new double[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0;i<N;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			int max=find_Max(arr);
			for(int i=0;i<N;i++) {
				arr_double[i]=(((double)arr[i]/max)*100);
			}
			System.out.println(find_Avg(arr_double));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		

	}
	static int find_Max(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int v:arr) {
			if(v>max) {
				max=v;
			}
		}
		return max;
	}
	static double find_Avg(double[] arr) {
		double avg = 0;
		for(double v:arr) {
			avg=avg+v;
		}
		return ((double)avg/arr.length);
	}

}
