import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static boolean[][][] visited;
    static int[][] arr;
    static int[] dr = { -1, 0, 1, 0 };
    static int[] dc = { 0, 1, 0, -1 };
    static int result = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        for(int i = 0; i < N; i++){
            String line = br.readLine();
            for(int j = 0; j < M; j++){
                arr[i][j] = line.charAt(j) - '0';
            }
        }
        bfs(0, 0);
        if(!visited[N-1][M-1][0] && !visited[N-1][M-1][1]) {
            System.out.println(-1);
        }else{
            System.out.println(result);
        }
    }
    static void bfs(int r, int c) {
        visited = new boolean[N][M][2];
        visited[r][c][0] = true;
        Deque<Node> q = new ArrayDeque<>();
        q.offerLast(new Node(r,c,0,1));

        while(!q.isEmpty()) {
            Node now = q.pollFirst();

            if (now.r == N-1 && now.c == M-1) {
                result = now.dist;
                return;
            }
            for(int k = 0; k < 4; k++) {
                int nr = now.r + dr[k];
                int nc = now.c + dc[k];
                if (nr >= 0 && nr < N && nc >= 0 && nc < M) {
                    if (arr[nr][nc] == 0) { // 벽 없음
                        if (!visited[nr][nc][now.crush]) {
                            visited[nr][nc][now.crush] = true;
                            q.offerLast(new Node(nr, nc, now.crush, now.dist + 1));
                        }
                    } else { // 벽 부심
                        if (now.crush == 0 && !visited[nr][nc][1]) {
                            visited[nr][nc][1] = true;
                            q.offerLast(new Node(nr, nc, 1, now.dist + 1));
                        }
                    }
                }
            }
        }
    }
}
class Node{
    int r;
    int c;
    int crush;
    int dist;
    public Node(int r, int c, int crush, int dist) {
        this.r = r;
        this.c = c;
        this.crush = crush;
        this.dist = dist;
    }
}
