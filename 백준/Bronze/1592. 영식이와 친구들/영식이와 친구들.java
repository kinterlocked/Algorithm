import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String num = br.readLine();
		StringTokenizer st = new StringTokenizer(num, " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());

		int[] arr = new int[N + 1];
		arr[1] = 1;
		int i = 1;
		int sum = 0;
		while (!(arr[i]==M)) {

			// 짝수 왼쪽
			if (i > 0 && arr[i] % 2 == 0 && !(arr[i] == 0)) {
				if(i - L <= 0) {
				i += N;
				}
				i -= L;
				arr[i] += 1;
			}
			// 홀수 오른쪽
			else {
				if (i > N || (i + L) > N) {
					i -= N ;
				}
				i += L;
				arr[i] += 1;
				if (i == N) {
					i -= N;
				}
			}
		}
		for (int j = 1; j <= N; j++) {
			sum += arr[j];
		}
		System.out.println(sum - 1);
	}
}
