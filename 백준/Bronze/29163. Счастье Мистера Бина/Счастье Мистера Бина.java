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
        StringTokenizer st ;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int even = 0;
        int odd = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            if(a % 2 == 0) {
                even++;
            }else {
                odd++;
            }
        }
        if(even > odd) {
            System.out.println("Happy");
        }else {
            System.out.println("Sad");
        }
    }
}