import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int[][] map;
	static boolean[][] visited;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static int count;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());

		map = new int[N][N];

		// 값 입력
		for (int i = 0; i < N; i++) {
			int index = 0;
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				map[i][index++] = Integer.parseInt(st.nextToken());
			}
		}

		// 높이 100까지 확인
		int max = 0;
		for (int day = 0; day <= 100; day++) {
			visited = new boolean[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] <= day) {
						visited[i][j] = true;
					}
				}
			}
			count = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (!visited[i][j]) {
						bfs(i, j);
						count++;
						if(count > max) {
							max = count;
						}
					}
				}
			}
			count = 0;
		}
		System.out.println(max);
	}

	public static void bfs(int i, int j) {
		Deque<Node> q = new ArrayDeque<>();
		q.offerLast(new Node(i, j));
		visited[i][j] = true;

		while (!q.isEmpty()) {
			Node now = q.pollFirst();
			for (int k = 0; k < 4; k++) {
				int nr = now.r + dr[k];
				int nc = now.c + dc[k];

				if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
					if (!visited[nr][nc]) {
						q.offerLast(new Node(nr, nc));
						visited[nr][nc] = true;
					}
				}
			}
		}
	}
}

class Node {
	int r;
	int c;

	public Node(int r, int c) {
		this.r = r;
		this.c = c;
	}
}
