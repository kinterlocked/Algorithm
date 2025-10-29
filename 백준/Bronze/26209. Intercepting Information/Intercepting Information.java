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
        
        int i;
        int[] a = new int[8];
        for(i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        for(i = 0; i < a.length; i++) {
            if(a[i] == 0 || a[i] == 1) {
                continue;
            }else {
                break;
            }
        }
        if(i == a.length) {
            System.out.println("S");
        }else {
            System.out.println("F");
        }
    }
}