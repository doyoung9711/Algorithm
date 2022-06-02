package Level3;

import java.util.Scanner;

public class BJ_10951 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		int i=0,b=0,tmp=0,a=0;
		while(sc.hasNextInt()) {
			a = sc.nextInt();
			b = sc.nextInt();
			arr[i]=a+b;
			tmp=i;
			i++;
		}
for(int j=0;j<=tmp;j++)
		System.out.println(arr[j]);
		sc.close();
	}

}
