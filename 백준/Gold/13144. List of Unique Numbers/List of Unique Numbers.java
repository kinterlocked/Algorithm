import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1];
        int max = Integer.MIN_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }

        long result = 0;
        int start = 1;
        int end = 1;
        boolean[] chk = new boolean[max + 1];
        while(start <= N) {
            while(end <= N && !chk[arr[end]]) {
                chk[arr[end]] = true;
                end++;
            }
            result += (end - start);
            chk[arr[start]] = false;
            start++;
        }
        System.out.println(result);
    }
}
