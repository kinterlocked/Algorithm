import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < T; tc++) {

			int N = Integer.parseInt(br.readLine());

			int[] arr = new int[N + 1];
			int[] dp = new int[N + 1];
			int[] count = new int[N + 1];
			dp[0] = 0;
			count[0] = 1;

			if (N >= 1) {
				count[1] = 0;
				dp[1] = 1;
				for (int i = 2; i < N + 1; i++) {
					dp[i] = dp[i - 1] + dp[i - 2];
					count[i] = (count[i-1] + count[i-2]++);
				}
			}
			System.out.println(count[N] + " " + dp[N]);
		}
	}
}
