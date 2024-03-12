import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {

	public static boolean[] prime;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		

		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine(), " ");
			int[] arr = new int[N];
			Deque<Integer> q = new LinkedList<>();

			for (int j = 0; j < N; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				arr[j] = tmp;
				q.offer(j);
			}

			int count = 0;
			while (!q.isEmpty()) {
				boolean check = false;
				int test = q.pollFirst();

				for (int j : arr) {
					if (arr[test] < j) {
						q.offer(test);
						check = true;
						break;
					}
				}

				if (!check) {
					count++;
					arr[test] = 0;
					if (test == M) {
						System.out.println(count);
						break;
					}
				}
			}
		}
	}
}