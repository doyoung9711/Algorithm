package Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_8958 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int N = Integer.parseInt(br.readLine());
			String[] str = new String[N];
			char[] str_ox = new char[80];
			
			for(int i=0;i<N;i++) {
				str[i]=br.readLine();
			}
			
			for(int j=0;j<N;j++) {
				int x=1;
				int result = 0;
				for(int i=0;i<str[j].length();i++) {
					str_ox[i]=str[j].charAt(i);
					if(i==0&&str_ox[i]=='O') {
						result = 1;
						continue;
					}
					else if(i==0&&str_ox[i]=='X') {
						result = 0;
						continue;
					}
					if(str_ox[i-1]=='O'&&str_ox[i]=='O') {
						result = result + ++x;
					}
					else if(str_ox[i-1]=='X'&&str_ox[i]=='O') {
						x=1;
						result = result + x;
					}
					
			}
				System.out.println(result);
			}
			}catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
