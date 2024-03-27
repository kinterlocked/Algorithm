import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int[] dc = { -1, 0, 1, 0 };
	static int[] dr = { 0, 1, 0, -1 };
	static int Allcount = 0;
	static ArrayList<Integer> ct;
	static int count = 0;

	static int[][] map;
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());

		map = new int[N][N];
		String line;
		// 값 입력
		for (int n = 0; n < N; n++) {
			line = br.readLine();
			int index = 0;
			for(int i = 0; i < N; i++) {
				map[n][i] = line.charAt(i) - '0';
			}
				

		}
		
		visited = new boolean[N][N];
		ct  = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 0) {
					visited[i][j] = true;
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					Allcount++;
					bfs(i, j);
				}
			}
		}
		Collections.sort(ct);
		System.out.println(Allcount);
		for(int i : ct) {
			System.out.println(i);
		}
	}

	private static void bfs(int r, int c) {
		Deque<Node> q = new ArrayDeque<>();
		q.offerLast(new Node(r, c));
		visited[r][c] = true;
		count++;
		while (!q.isEmpty()) {
			Node now = q.pollFirst();
			for (int k = 0; k < 4; k++) {
				int nr = now.r + dr[k];
				int nc = now.c + dc[k];

				if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
					if (!visited[nr][nc]) {
						q.offerLast(new Node(nr, nc));
						count++;
						visited[nr][nc] = true;
					}
				}
			}
		}
		ct.add(count);
		count = 0;

	}
}

class Node {
	int r, c;

	public Node(int r, int c) {
		this.r = r;
		this.c = c;
	}

}
