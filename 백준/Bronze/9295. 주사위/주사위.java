import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            int dice1 = Integer.parseInt(st.nextToken());
            int dice2 = Integer.parseInt(st.nextToken());
            sb.append("Case " + tc + ": " + (dice1+dice2) + "\n");
        }
        System.out.println(sb.toString());
    }
}