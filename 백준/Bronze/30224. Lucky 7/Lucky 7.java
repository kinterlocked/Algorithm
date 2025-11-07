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

        String n = br.readLine();
        int i;
        for(i = 0; i < n.length(); i++) {
            if(n.charAt(i) == '7') {
                break;
            }
        }
        int num = Integer.parseInt(n);
        if(i == n.length() && num % 7 != 0) {
            System.out.println("0");
        }else if(i == n.length() && num % 7 == 0) {
            System.out.println("1");
        }else if(i != n.length() && num % 7 != 0) {
            System.out.println("2");
        }else if(i != n.length() && num % 7 == 0) {
            System.out.println("3");
        }
    }
}