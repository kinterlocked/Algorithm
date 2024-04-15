import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static int V;
	static int K;
	static ArrayList<Integer>[] arr ;
	static boolean[] visited;
	static int count = 0;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		V = Integer.parseInt(br.readLine()); // 정점개수
		K = Integer.parseInt(br.readLine()); // 간선의 수
		
		
		arr = new ArrayList[V + 1];
		visited = new boolean[V + 1];
		
		// 초기화
		for(int i = 0 ; i < V + 1; i++) {
			arr[i] = new ArrayList<>();
		}
		for(int i = 0; i < K; i++) {
		st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		arr[a].add(b);
		arr[b].add(a);	
		}
		bfs(1);
		System.out.println(count);
	}

	private static void bfs(int i) {
		Deque<Integer> q = new ArrayDeque<>();
		
		q.offerLast(i);
		visited[i] = true;
		while(!q.isEmpty()) {
			int index = q.pollFirst();
			for(int j = 0; j < arr[index].size(); j++) {				
				if(!visited[arr[index].get(j)]) {
					visited[arr[index].get(j)] = true;
					count++;
					q.offerLast(arr[index].get(j));
				}
			}
		}
	}
}
