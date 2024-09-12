import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        while (N > 0) {
            int temp = N % B;
            char Ctemp;

            if (temp < 10) {
                Ctemp = (char) ('0' + temp);
            } else {
                Ctemp = (char) ('A' + temp - 10);
            }
            sb.insert(0, Ctemp);
            N /= B;
        }
        System.out.println(sb.toString());
    }
}
