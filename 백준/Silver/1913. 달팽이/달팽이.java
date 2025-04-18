import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] dr = {1, 0, -1, 0};
    static int[] dc = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int target = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][N];

        int r = 0, c = 0, index = 0;

        for (int num = N * N; num > 0; num--) {
            arr[r][c] = num;

            int nr = r + dr[index];
            int nc = c + dc[index];
            if (nr < 0 || nr >= N || nc < 0 || nc >= N || arr[nr][nc] != 0) {
                index = (index + 1) % 4;
                nr = r + dr[index];
                nc = c + dc[index];
            }
            r = nr;
            c = nc;
        }

        int tr = 0, tc = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]).append(" ");
                if (arr[i][j] == target) {
                    tr = i + 1;
                    tc = j + 1;
                }
            }
            sb.append("\n");
        }
        sb.append(tr).append(" ").append(tc);
        System.out.print(sb);
    }
}
