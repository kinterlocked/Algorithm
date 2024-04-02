import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	static int N;
	static char[][] arr;
	static boolean[][] visited;
	static int result1 = 0;
	static int result2 = 0;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static int l = 0;
	static char[] cArr1 = { 'R', 'G', 'B' };
	static char[] cArr2 = { 'R', 'B' };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		N = Integer.parseInt(br.readLine());

		arr = new char[N][N];

		for (int i = 0; i < N; i++) {
			line = br.readLine();
			arr[i] = line.toCharArray();
		}

		// 일반인 색별로 관리
		for (l = 0; l < 3; l++) {
			visited = new boolean[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (arr[i][j] != cArr1[l]) {
						visited[i][j] = true;
					}
				}
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (!visited[i][j] && cArr1[l] == arr[i][j]) {
						visited[i][j] = true;
						bfs1(i, j);
					}
				}
			}
		}
		// 적록색 색별로 관리
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(arr[i][j] == 'G') {
					arr[i][j] = 'R';
				}
			}
		}
		for (l = 0; l < 2; l++) {
			visited = new boolean[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (arr[i][j] != cArr2[l]) {
						visited[i][j] = true;
					}
				}
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (!visited[i][j] && cArr2[l] == arr[i][j]) {
						visited[i][j] = true;
						bfs2(i, j);
					}
				}
			}
		}

		// 탐색 끝 출력
		System.out.println(result1 + " " + result2);
	}

	// 일반인 bfs
	private static void bfs1(int i, int j) {
		Deque<Node> q = new ArrayDeque<>();

		q.offerLast(new Node(i, j));
		visited[i][j] = true;

		while (!q.isEmpty()) {

			Node node = q.pollFirst();
			for (int k = 0; k < 4; k++) {
				int nr = node.r + dr[k];
				int nc = node.c + dc[k];

				if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
					if (!visited[nr][nc] && arr[nr][nc] == cArr1[l]) {
						visited[nr][nc] = true;
						q.offerLast(new Node(nr, nc));
					}
				}
			}
		}
		result1++;
	}
	
	// 적록색 bfs
	private static void bfs2(int i, int j) {
		Deque<Node> q = new ArrayDeque<>();

		q.offerLast(new Node(i, j));
		visited[i][j] = true;

		while (!q.isEmpty()) {

			Node node = q.pollFirst();
			for (int k = 0; k < 4; k++) {
				int nr = node.r + dr[k];
				int nc = node.c + dc[k];

				if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
					if (!visited[nr][nc] && arr[nr][nc] == cArr2[l]) {
						visited[nr][nc] = true;
						q.offerLast(new Node(nr, nc));
					}
				}
			}
		}
		result2++;
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
