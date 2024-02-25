import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line);
		
		int num = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[num];
		
		String numline = br.readLine();
		StringTokenizer st2 = new StringTokenizer(numline);
		
		int  i = 0;
		while(st2.hasMoreTokens()) {
			arr[i] = Integer.parseInt(st2.nextToken());
			i++;
		}
		int result = 0;
		for(int j = 0; j < arr.length - 2; j++) {
			for(int k = j + 1; k < arr.length - 1; k++) {
				for(int l = k + 1; l < arr.length; l++) {
					int test = (arr[j] + arr[k]+arr[l]);
					if(test <= max && test > result){
						result = test;
					}
				}
			}
		}
		System.out.println(result);
	}
}