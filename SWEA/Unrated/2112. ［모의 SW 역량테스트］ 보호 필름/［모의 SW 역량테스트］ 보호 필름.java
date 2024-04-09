import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static int D, W, K;
	static int[][] film;
	static int ans;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {

			st = new StringTokenizer(br.readLine());

			D = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());

			film = new int[D][W];
			String line;
			for (int i = 0; i < D; i++) {
				line = br.readLine().replaceAll(" ", "");
				for (int j = 0; j < W; j++) {
					film[i][j] = line.charAt(j) - '0';
				}
			}
			ans = K; // 높은 숫자를 써도 되지만 어차피 투약횟수는 최대 K이다.

			makeFilm(0, 0);
			System.out.println("#" + tc + " " + ans);
		}
	}

	// row : 인덱스(현재 약품을 주입할 행)
	// cnt : 약품을 주입한 횟수
	public static void makeFilm(int row, int cnt) {

		if (isOK()) {
			ans = Math.min(ans, cnt);
			return;
		}
		if (ans < cnt) {
			return;
		}
		if (row == D) {
			return;
		}

		// 주입 전 원상복구를 위해 따로 저장을 해야함
		int[] tmp = new int[W];
		for (int i = 0; i < W; i++) {
			tmp[i] = film[row][i];
		}

		// 주입 X
		makeFilm(row + 1, cnt);

		// 주입 A
		injection(row, 0);
		makeFilm(row + 1, cnt + 1);

		// 주입 B
		injection(row, 1);
		makeFilm(row + 1, cnt + 1);

		// 원상복구
		for (int i = 0; i < W; i++) {
			film[row][i] = tmp[i];
		}
	}

	// 보호필름 K개 이상인지 확인
	private static boolean isOK() {
		for (int c = 0; c < W; c++) {
			boolean flag = false;
			int cnt = 1;
			for (int r = 1; r < D; r++) {
				if (film[r][c] == film[r - 1][c]) {
					cnt++;
				} else {
					cnt = 1;
				}
				if (cnt >= K) {
					flag = true;
					break;
				}
			} // 해당 열 검사 끝
			if (!flag) {
				return false;
			}
		}
		// 위에서 리턴없이 여기까지 오면 통과
		return true;
	}

	public static void injection(int row, int drug) {
		for (int i = 0; i < W; i++) {
			film[row][i] = drug;
		}
	}
}
