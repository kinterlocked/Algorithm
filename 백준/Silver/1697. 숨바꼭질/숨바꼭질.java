import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int K;
	static boolean[] visited = new boolean[100001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		if (N == K) {
			System.out.println("0");
		} else {
			System.out.println(bfs(N));
		}
	}

	private static int bfs(int num) {
		Deque<Node> q = new ArrayDeque<>();

		q.offerLast(new Node(num, 0));
		visited[num] = true;

		while (!q.isEmpty()) {
			Node now = q.pollFirst();

			int[] next = new int[] { now.num + 1, now.num - 1, now.num * 2 };

			for (int i = 0; i < 3; i++) {
				if (0 <= next[i] && next[i] <= 100000) {
					if (K == next[i]) {
						return now.dist + 1;

					}
					if (next[i] != K && !visited[next[i]]) {
						visited[next[i]] = true;
						q.offerLast(new Node(next[i], now.dist + 1));
					}
				}
			}
		}
		return -1;
	}
}

class Node {
	int num;
	int dist;

	public Node(int num, int dist) {
		this.num = num;
		this.dist = dist;
	}
}