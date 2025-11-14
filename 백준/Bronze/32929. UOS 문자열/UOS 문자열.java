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

        int a = Integer.parseInt(br.readLine());
        if(a % 3 == 0) {
            System.out.println("S");
        }else if(a % 3 == 1) {
            System.out.println("U");
        }else if(a % 3 == 2) {
            System.out.println("O");
        }
    }
}
