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
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int H = 0, Y = 0;
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            H += Integer.parseInt(st.nextToken());
            Y += Integer.parseInt(st.nextToken());
        }
        if (H < Y) System.out.println("Hanyang Univ.");
        else if (H > Y) System.out.println("Yongdap");
        else System.out.println("Either");
    }
}