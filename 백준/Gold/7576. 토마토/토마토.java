import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static int M;
	static int N;
	static int[][] arr;
	static boolean[][] visited;
	static int day = 0;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static Deque<Node> q = new ArrayDeque<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		arr = new int[N][M];
		visited = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (arr[i][j] == -1) {
					visited[i][j] = true;
				}
				// 애초에 넣기
				if (arr[i][j] == 1) {
					q.offerLast(new Node(i, j));
				}
			}
		}
		// 여기까지 입력

//		int count = 0;
//		while (check() && count < 1000000) {
//			add();
//			count++;
//		}
//
//		System.out.println(count == 1000000 ? -1 : day);

		day = bfs();
		
		if(check()) {
			System.out.println("-1");
		}else {
			System.out.println(day - 1);
		}
	}

	private static int bfs() {
		while (!q.isEmpty()) {
			// 날짜별
			int num = q.size();
			// 첫 토마토 개수만큼만 돔
			for (int i = 0; i < num; i++) {
				Node now = q.pollFirst();
				for (int k = 0; k < 4; k++) {
					int nr = now.r + dr[k];
					int nc = now.c + dc[k];
					if (nr >= 0 && nr < N && nc >= 0 && nc < M && arr[nr][nc] == 0 && !visited[nr][nc]) {
						arr[nr][nc] = 1;
						q.offerLast(new Node(nr,nc));
					}
				}
			}
			day++;
		}
		return day;
	}

//	static void add() {
//
//		// 첫 사이클이 끝나면 1일 플러스
////		day++;
//		for (int a = 0; a < N; a++) {
//			for (int b = 0; b < M; b++) {
//				if (arr[a][b] == 1 && !visited[a][b]) {
//					q.offerLast(new Node(a, b));
//					visited[a][b] = true;
//				}
//			}
//		}
//		bfs();
//	}

	static boolean check() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (!visited[i][j] && arr[i][j] == 0) {
					return true;
				}
			}
		}
		return false;
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