import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    static int w, h;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dr = { -1, -1, 0, 1, 1, 1, 0, -1 };
    static int[] dc = { 0, 1, 1, 1, 0, -1, -1, -1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        while (!(w == 0 && h == 0)) {
            int result = 0;
            arr = new int[h][w];

            for (int i = 0; i < h; i++) {
                int index = 0;
                st = new StringTokenizer(br.readLine());
                while (st.hasMoreTokens()) {
                    arr[i][index++] = Integer.parseInt(st.nextToken());
                }
            }
            visited = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (arr[i][j] == 1  && !visited[i][j]) {
                        visited[i][j] = true;
                        bfs(i, j);
                        result++;
                    }
                }
            }
            sb.append(result).append("\n");
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
        }
        System.out.println(sb);
        
    }

    private static void bfs(int i, int j) {
        Deque<Node> q = new ArrayDeque<>();

        q.offerLast(new Node(i, j));

        while (!q.isEmpty()) {
            Node node = q.pollFirst();
            for (int k = 0; k < 8; k++) {
                int nr = node.r + dr[k];
                int nc = node.c + dc[k];

                if (nr >= 0 && nr < h && nc >= 0 && nc < w) {
                    if (arr[nr][nc] == 1 && !visited[nr][nc]) {
                        visited[nr][nc] = true;
                        q.offerLast(new Node(nr,nc));
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