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
       int M = Integer.parseInt(br.readLine());
       for(int i = 0; i < N; i++) {
           for(int j = 0; j < M; j++) {
               sb.append('*');
           }
           sb.append('\n');
       }
        System.out.println(sb.toString());
    }
}