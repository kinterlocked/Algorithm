import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());


		for (int tc = 0; tc < T; tc++) {
			int[] aArr = new int[6];
			int[] bArr = new int[6];
			// a 입력
			StringTokenizer st = new StringTokenizer(br.readLine());
			int trash1 = Integer.parseInt(st.nextToken());
			while (st.hasMoreTokens()) {
				int i = Integer.parseInt(st.nextToken());
				aArr[i] += 1;
			}
			st = new StringTokenizer(br.readLine());
			int trash2 = Integer.parseInt(st.nextToken());
			// b 입력
			while (st.hasMoreTokens()) {
				int i = Integer.parseInt(st.nextToken());
				bArr[i] += 1;
			}
			
			start: for (int i = 5; i >= 0; i--) {
				if (aArr[i] > bArr[i]) {
					System.out.println("A");
					break start;
				} else if (aArr[i] < bArr[i]) {
					System.out.println("B");
					break start;
				} else if (i == 0) {
					System.out.println("D");
					break start;
				}
			}
		}
	}
}