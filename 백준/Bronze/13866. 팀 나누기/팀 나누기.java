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

        int[] arr = new int[4];
        for(int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int team1 = Math.abs((arr[3] + arr[0]) - (arr[1] + arr[2]));
        int team2 = Math.abs((arr[3] + arr[2]) - (arr[1] + arr[0]));

        System.out.println(Math.min(team1, team2));
    }
}