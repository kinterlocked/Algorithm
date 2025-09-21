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
        
        int td1 = Integer.parseInt(st.nextToken());
        int fg1 = Integer.parseInt(st.nextToken());
        int tp1 = Integer.parseInt(st.nextToken());
        int ep1 = Integer.parseInt(st.nextToken());
        int s1 = Integer.parseInt(st.nextToken());

        int score1 = td1 * 6 + fg1 * 3 + tp1 * 2 + ep1 * 1 + s1 * 2;

        st= new StringTokenizer(br.readLine());
        int td2 = Integer.parseInt(st.nextToken());
        int fg2 = Integer.parseInt(st.nextToken());
        int tp2 = Integer.parseInt(st.nextToken());
        int ep2 = Integer.parseInt(st.nextToken());
        int s2 = Integer.parseInt(st.nextToken());

        int score2 = td2 * 6 + fg2 * 3 + tp2 * 2 + ep2 * 1 + s2 * 2;
        
        System.out.println(score1 + " " + score2);
    }
}