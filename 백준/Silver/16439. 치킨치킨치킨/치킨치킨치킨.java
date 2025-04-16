import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int result = 0;
        for(int i = 0; i < M; i++) {
            for(int j = i + 1; j < M; j++) {
                for(int k = j + 1; k < M; k++) {
                    int temp = 0;
                    for(int n = 0; n < N; n++) {
                        int max = Math.max(arr[n][i], Math.max(arr[n][j], arr[n][k]));
                        temp += max;
                    }
                    result = Math.max(result, temp);
                }
            }
        }
        System.out.println(result);
    }
}
