package Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10952 {

	public static void main(String[] args) {
		try {
			int A=1, B = 1, i=0, tmp=0;
			int[] arr = new int[100];
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true) {
				if(A==0&&B==0) {
					break;
				}
				
				StringTokenizer st = new StringTokenizer(br.readLine());
				A = Integer.parseInt(st.nextToken());
				B = Integer.parseInt(st.nextToken());
				arr[i]=A+B;
				i++;
				tmp = i;
			}
			br.close();
			for(int j=0;j<tmp-1;j++)
				System.out.println(arr[j]);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
