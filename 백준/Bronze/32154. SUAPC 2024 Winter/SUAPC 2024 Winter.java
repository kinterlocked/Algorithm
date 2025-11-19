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

       int n = Integer.parseInt(br.readLine());

       boolean[] visit = new boolean[13];
       visit[0] = true;
       visit[1] = n == 1 || n == 4 || n == 10 ? true : false;
       visit[2] = true;
       visit[3] = n == 1 ? true : false;
       visit[4] = n != 10 ? true : false;
       visit[5] = true;
       visit[6] = true;
       visit[7] = true;
       visit[8] = n == 2 || n == 3 ? true : false;
       visit[9] = n == 1 ? true : false;
       visit[11] = true;
       visit[12] = true;

       int count = 0;
       for (int i = 0; i < 13; i++) {
           if (visit[i]) {
               count++;
           }
       }
       sb.append(count).append("\nA");
       for (int i = 1; i < 13; i++) {
           if (visit[i]) {
               sb.append(" ").append((char) ('A' + i));
           }
       }
        System.out.println(sb.toString());
    }
}
