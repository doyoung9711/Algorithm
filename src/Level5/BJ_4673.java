package Level5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BJ_4673 {

	public static void main(String[] args) {
		Set<Integer> set =new HashSet <Integer>();
		for(int i=1;i<10001;i++) {
				if(dn(i)>10000)
					continue;
				set.add(dn(i));
		}
//		List<Integer> list = new ArrayList<Integer>(set);
//		Collections.sort(list);
		
				for(int j=1;j<10001;j++) {
					if(!set.contains(j))	
					System.out.println(j);
				}
				
	}
	static int dn(int x) {
		int result = x;
		String x_str = String.valueOf(x);
		int[] arr = new int[5];
		for(int i=0;i<x_str.length();i++) {
			arr[i]=x_str.charAt(i)-'0';
		}
		for(int i=0;i<arr.length;i++) {
			result = result+arr[i];
		}
		return result;
	}

}
