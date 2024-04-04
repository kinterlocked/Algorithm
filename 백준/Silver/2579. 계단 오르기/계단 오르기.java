import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] dp = new int[N + 1];
		int[] arr = new int[N + 1];
		arr[0] = 0;
		for (int i = 1; i < N + 1; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		dp[0] = 0;
		dp[1] = arr[1];
		if (N >= 2) {
			dp[2] = arr[1] + arr[2];
			for (int i = 3; i < N + 1; i++) {
				dp[i] = Math.max(arr[i] + dp[i - 2], arr[i] + dp[i - 3] + arr[i - 1]);
			}
		}
		System.out.println(dp[N]);
	}
}
