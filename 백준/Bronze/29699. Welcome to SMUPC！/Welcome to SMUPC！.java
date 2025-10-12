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

        int n = Integer.parseInt(br.readLine());
        if(n % 14 == 1) {
            System.out.println("W");
        }else if(n % 14 == 2 || n % 14 == 7) {
            System.out.println("e");
        }else if(n % 14 == 3) {
            System.out.println("l");
        }else if(n % 14 == 4) {
            System.out.println("c");
        }else if(n % 14 == 5 || n % 14 == 9) {
            System.out.println("o");
        }else if(n % 14 == 6) {
            System.out.println("m");
        }else if(n % 14 == 8) {
            System.out.println("T");
        }else if(n % 14 == 10) {
            System.out.println("S");
        }else if(n % 14 == 11) {
            System.out.println("M");
        }else if(n % 14 == 12) {
            System.out.println("U");
        }else if(n % 14 == 13) {
            System.out.println("P");
        }else if(n % 14 == 0) {
            System.out.println("C");
        }
    }
}