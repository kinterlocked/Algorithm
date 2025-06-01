import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int a, b, c;
        for(int i = N - 1; i >= 2; i--) {
            a = arr[i];
            b = arr[i - 1];
            c = arr[i - 2];

            if (b + c > a) {
                System.out.println(a + b + c);
                return;
            }
        }
        System.out.println("-1");
    }
}