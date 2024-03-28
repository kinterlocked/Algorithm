import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	static boolean[] visited;
	static ArrayList<Integer>[] list;
	static int sum;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		list = new ArrayList[N + 1];

		for (int i = 1; i <= N; i++) {
			list[i] = new ArrayList<>();
		}

		for (int i = 0; i < N - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			list[a].add(b);
			list[b].add(a);
		}
		visited = new boolean[N + 1];
		visited[1] = true;
		dfs(1, 0);
		if ((sum & 1) == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static void dfs(int node, int dist) {
		boolean leaf = true;
		for (int i : list[node]) {
			if (!visited[i]) {
				leaf = false;
				visited[i] = true;
				dfs(i, dist + 1);
			}
		}
		if (leaf) {
			sum += dist;
		}

	}
}
