import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;

        for (int i = 1; i <= N; i++) {
            result1 = result1 + i;
        }
        sb.append(result1 + "\n");

        for (int j = 1; j <= N; j++) {
            result2 = result2 + j;
        }
        sb.append(result2 * result2 + "\n");

        for (int k = 1; k <= N; k++) {
            result3 = (result3 + (k * k * k));
        }
        sb.append(result3 + "\n");
        System.out.println(sb.toString());
    }
}