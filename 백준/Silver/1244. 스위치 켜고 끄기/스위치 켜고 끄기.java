import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String num = br.readLine();
		StringTokenizer st = new StringTokenizer(num, " ");

		int[] arr = new int[N + 1];

		int i = 1;

		while (st.hasMoreTokens()) {
			arr[i] = Integer.parseInt(st.nextToken());
			i++;
		}

		int T = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < T; tc++) {
			String line = br.readLine();
			StringTokenizer str = new StringTokenizer(line, " ");
			int gender = Integer.parseInt(str.nextToken());
			int sNum = Integer.parseInt(str.nextToken());

			// 남성
			if (gender == 1) {
				int k = sNum;
				while (sNum <= N) {
					if (arr[sNum] == 1) {
						arr[sNum] = 0;
					} else {
						arr[sNum] = 1;
					}
					sNum += k;
				}
			}
			// 여성
			else {
				if (arr[sNum] == 1) {
					arr[sNum] = 0;
				} else {
					arr[sNum] = 1;
				}
				
				int len = 1;
				while (sNum - len > 0 && sNum + len <= N && (arr[sNum - len] == arr[sNum + len]) ) {
					if (arr[sNum - len] == 1) {
						arr[sNum - len] = 0;
						arr[sNum + len] = 0;
					} else {
						arr[sNum - len] = 1;
						arr[sNum + len] = 1;
					}
					len++;
				}

			}
		}
		int count = 0;
		for (int j = 1; j <= N; j++) {
			System.out.print(arr[j] + " ");
			count++;
			if(count == 20) {
				System.out.println();
				count = 0;
			}
		}
	}
}
