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
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            String a = sc.next();
            String b = sc.next();
            if(a.length() != b.length()) {
                System.out.println("ERROR");
            }else {
                int j;
                for(j = 0; j < a.length(); j++) {
                    if(a.charAt(j) != b.charAt(j)) {
                        break;
                    }
                }

                if(j == a.length()) {
                    System.out.println("OK");
                }else {
                    System.out.println("ERROR");
                }
            }
        }
    }
}