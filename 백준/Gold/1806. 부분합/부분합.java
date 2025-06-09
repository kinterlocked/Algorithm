import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0, right = 0, sum = 0;
        int result = Integer.MAX_VALUE;

        while (true) {
            if (sum >= S) {
                int len = right - left;
                result = Math.min(result, len);
                sum -= arr[left++];
            } else if (right == N) {
                break;
            } else {
                sum += arr[right++];
            }
        }
        if(result == Integer.MAX_VALUE) {
            System.out.println(0);
        }else{
            System.out.println(result);
        }
    }
}