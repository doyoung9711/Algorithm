package Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class BJ_2588 {

	public static void main(String[] args) {
		try{			
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			
			int a = Integer.parseInt(bf.readLine());
			int b = Integer.parseInt(bf.readLine());
			bf.close();
			int i = 10;
			int temp = b;
			while(temp>0) {
				System.out.println(a*(temp%i));
				temp = temp/10;
			}
			System.out.println(a*b);
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		

	}

}
