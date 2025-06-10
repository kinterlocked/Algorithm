import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static int[] arr;
    static boolean[] visited;
    static List<Integer> result;
    static int start;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        result = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            visited = new boolean[N + 1];
            start = i;
            dfs(i);
        }

        Collections.sort(result);
        sb.append(result.size() + "\n");
        
        for (int i = 0; i < result.size(); i++) {
            sb.append(result.get(i) + "\n");
        }
        System.out.println(sb.toString());
    }
    static void dfs(int current) {
        visited[current] = true;
        int next = arr[current];

        if (!visited[next]) {
            dfs(next);
        } else if (next == start) {
            result.add(start);
        }
    }
}