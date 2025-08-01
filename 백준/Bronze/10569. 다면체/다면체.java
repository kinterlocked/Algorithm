import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
           st = new StringTokenizer(br.readLine());
           int V = Integer.parseInt(st.nextToken());
           int E = Integer.parseInt(st.nextToken());

            int result = 2;
            result = result - V + E;
            sb.append(result + "\n");
        }
        System.out.println(sb.toString());
    }
}