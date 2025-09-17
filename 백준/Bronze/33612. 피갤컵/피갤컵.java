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
        //StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int addMonth = (N - 1) * 7;
        int nowMonth = 8 + addMonth;
        int year = (nowMonth - 1) / 12 + 2024;
        int month = (nowMonth - 1) % 12 + 1;

        System.out.println(year + " " + month);
    }
}