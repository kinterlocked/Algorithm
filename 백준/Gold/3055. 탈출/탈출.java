import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static int R;
	static int C;
	static char arr[][];

	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };

	static Deque<Node> q = new ArrayDeque<>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());

		arr = new char[R][C];

		Node S = null;

		for (int i = 0; i < R; i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			for (int j = 0; j < C; j++) {
				arr[i][j] = s.charAt(j);

				if (arr[i][j] == 'S') {
					S = new Node(i, j, 0, 'S');
				}

				if (arr[i][j] == '*') {
					q.offerLast(new Node(i, j, 0, '*'));
				}

			}
		}

		q.offerLast(S);

		int result = bfs();

		System.out.println(result == 0 ? "KAKTUS" : result);

	}

	private static int bfs() {
		while (!q.isEmpty()) {
			Node now = q.pollFirst();

			for (int d = 0; d < dr.length; d++) {
				int nr = now.x + dr[d];
				int nc = now.y + dc[d];

				if (nr >= 0 && nr < R && nc >= 0 && nc < C && arr[nr][nc] != 'X' && arr[nr][nc] != '*') {
					if (now.area == '*') {
						if (arr[nr][nc] == '.' || arr[nr][nc] == 'S') {

							q.offerLast(new Node(nr, nc, now.time + 1, '*'));
							arr[nr][nc] = '*';
						}
					}

					if (now.area == 'S') {

						if (arr[nr][nc] == 'D') {

							return now.time + 1;
						}

						if (arr[nr][nc] == '.') {
							arr[nr][nc] = 'S';
							q.offerLast(new Node(nr, nc, now.time + 1, 'S'));

						}

					}
				}
			}
		}
		return 0;
	}
}
class Node {
	int x;
	int y;
	int time;
	char area;

	public Node(int x, int y, int time, char area) {
		this.x = x;
		this.y = y;
		this.time = time;
		this.area = area;
	}
}