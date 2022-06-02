package Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_3052 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] arr = new int[10];
		int[] rest = new int[10];
		int result = 10;
			try {	
				for(int i=0;i<10;i++) {
					arr[i] = Integer.parseInt(br.readLine());
					rest[i] = arr[i]%42;
				}
				for(int i=0;i<10;i++){
					for(int j=i+1;j<10;j++) {
					if(rest[i]==rest[j]) {
						result=result-1;
						break;
					}
				}
					}
				System.out.println(result);
			}catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
