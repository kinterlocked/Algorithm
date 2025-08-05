import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

       int A = Integer.parseInt(st.nextToken());
       int B = Integer.parseInt(st.nextToken());
       int C = Integer.parseInt(st.nextToken());

       int rival = B / A;
       int WARBOY = rival * 3;
       System.out.println(WARBOY * C);
    }
}