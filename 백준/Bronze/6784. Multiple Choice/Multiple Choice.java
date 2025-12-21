import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Scanner sc =new Scanner(System.in);

        int n = Integer.parseInt(br.readLine());
        String[] nb = new String[n];

        // 첫 번째 n개 문자열 입력
        for (int i = 0; i < n; i++) {
            nb[i] = br.readLine();
        }

        int r = 0;

        // 두 번째 n개 문자열 입력 + 비교
        for (int i = 0; i < n; i++) {
            String t = br.readLine();
            if (t.equals(nb[i])) {
                r++;
            }
        }

        System.out.print(r);
    }
}