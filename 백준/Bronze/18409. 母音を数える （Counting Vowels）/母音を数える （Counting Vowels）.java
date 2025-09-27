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

        int n = Integer.parseInt(br.readLine());
        String a = br.readLine();
        int count = 0;

        for(int i = 0; i < n; i++) {
            if((char)a.charAt(i) == 'a' || (char)a.charAt(i) == 'e' || (char)a.charAt(i) == 'i' || (char)a.charAt(i) == 'o' || (char)a.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}