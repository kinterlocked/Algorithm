import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int j = 1;
        while(n != 0) {
            sb.append("Case " + j + ": Sorting... done!" + "\n");
            j++;
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
        }
        System.out.println(sb.toString());
    }
}