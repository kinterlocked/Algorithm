import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[T + 1];
		int[] count = new int[N + 1];
		int[] hope = new int[N + 1];

		for (int n = 1; n <= N; n++) {
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line);
			int k1 = Integer.parseInt(st.nextToken());
			int k2 = Integer.parseInt(st.nextToken());

			start: for (int i = k1; i <= k2; i++) {
				int sum = k2 - k1 + 1;
				hope[n] = sum;
				if (arr[i] == 0) {
					arr[i] = n;
				} else if (arr[i] != 0) {
					continue start;
				}
			}
		}
		int hmax = 0;
		for (int i = 1; i < hope.length; i++) {
			if(hope[i] > hmax) {
				hmax = hope[i];
			}
		}

		int num = 0;
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == 0) {
				continue;
			} else {
				num = arr[i];
				count[num] += 1;
				if (count[num] > max) {
					max = count[num];
				}
			}
		}
		end: for(int i = 1; i < hope.length; i++) {
			if(hope[i] == hmax) {
				for(int j = 1; j < count.length; j++){
					if(count[j] == max) {
						System.out.println(i);
						System.out.println(j);
						break end;

					}
				}
			}
		}
	}
}
