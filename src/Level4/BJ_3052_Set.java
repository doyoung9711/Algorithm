package Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BJ_3052_Set {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] array = new int[10];
		int rest=0;
		Set<Integer> set = new HashSet<Integer>();
		try {
			for(int i=0;i<10;i++) {
				array[i] = Integer.parseInt(br.readLine());
				rest=array[i]%42;
				set.add(rest);
			}
			System.out.println(set.size());
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
