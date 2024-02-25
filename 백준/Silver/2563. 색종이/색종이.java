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

		int T = Integer.parseInt(br.readLine());
		int[][] arr = new int[101][101];
		for (int tc = 0; tc < T; tc++) {
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			for (int i = a; i < a + 10; i++) {
				for (int j = b; j < b + 10; j++) {
					arr[i][j] = 1;
				}
			}
		}
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i][j] == 1) {
					count++;
				}
			}
		}
		System.out.println(count);		
	}
}