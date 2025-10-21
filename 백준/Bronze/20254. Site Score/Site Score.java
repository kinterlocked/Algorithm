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

        int UR = Integer.parseInt(st.nextToken());
        int TR = Integer.parseInt(st.nextToken());
        int UO = Integer.parseInt(st.nextToken());
        int TO = Integer.parseInt(st.nextToken());

        System.out.println(56 * UR + 24 * TR + 14 * UO + 6 * TO);
    }
}