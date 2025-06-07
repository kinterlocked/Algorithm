import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N + 1][6];

        for(int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j < 6; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int maxCount = -1;
        int result = 1;

        for (int i = 1; i <= N; i++) {
            int count = 0;
            for (int j = 1; j <= N; j++) {
                if (i == j){
                    continue;
                }
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if (count > maxCount) {
                maxCount = count;
                result = i;
            }
        }
        System.out.println(result);
    }
}