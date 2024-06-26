import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] arr = new int[N][M];
		int[][] dp = new int[N][M];

		for (int i = 0; i < N; i++) {
			int index = 0;
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				arr[i][index++] = Integer.parseInt(st.nextToken());
			}
		}
		// 초기 값 세팅
		dp[0][0] = arr[0][0];
		for (int i = 1; i < N; i++) {
			dp[i][0] = dp[i - 1][0] + arr[i][0];
		}
		for (int i = 1; i < M; i++) {
			dp[0][i] = dp[0][i - 1] + arr[0][i];
		}
		for(int i = 1; i < N; i++) {
			for(int j = 1; j < M; j++) {
				dp[i][j] = Math.max(arr[i][j]+dp[i-1][j],arr[i][j] + dp[i][j-1]);
			}
		}
		System.out.println(dp[N-1][M-1]);
		
	}
}
