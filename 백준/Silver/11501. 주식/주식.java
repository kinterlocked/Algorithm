import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int tc = 0; tc < T; tc++){
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < N; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int max = Integer.MIN_VALUE;
            long result = 0;
            for(int i = arr.length - 1; i >= 0; i--){
                if(arr[i] > max){
                    max = arr[i];
                }
                if(arr[i] < max){
                    result += (max - arr[i]);
                }
            }
            sb.append(result + "\n");
        }
        System.out.println(sb.toString());
    }
}
