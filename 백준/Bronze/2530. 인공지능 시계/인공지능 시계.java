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

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        
        int sum = s + n;
        m += sum / 60;
        sum %= 60;
        h += m / 60;
        m %= 60;
        h %= 24;
        System.out.format("%d %d %d",h,m,sum);
    }
}