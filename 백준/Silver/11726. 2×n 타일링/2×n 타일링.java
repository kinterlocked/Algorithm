import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] dp = new int[N + 1];

		dp[1] = 1;
		
		if (N >= 3) {
			dp[2] = 2;
			for (int i = 3; i < N + 1; i++) {
				dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
			}
			System.out.println(dp[N]);
		}else if(N == 2){
			dp[2] = 2;
			System.out.println(dp[N]);
		}else {
			System.out.println(dp[N]);
		}
	}
}
