package Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BJ_2562 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int[] arr = new int[9];
			for(int i=0; i<9;i++) {
				arr[i]=Integer.parseInt(br.readLine());
			}
			max(arr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void max(int [] arr) {
		int result = arr[0];
		int result_i = 1;
		for(int i=1;i<9;i++) {
			if(arr[i]>result) {
				result = arr[i];
				result_i = i+1;
			}
		}
		System.out.println(result);
		System.out.println(result_i);
	}

}
