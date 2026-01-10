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
        int[] a = new int[4];
        int i;
        for(i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        for(i = 0; i < a.length; i++) {
            if(a[i] == x) {
                break;
            }
        }

        if(i == a.length) {
            System.out.println("0");
        }else {
            System.out.println(i + 1);
        }
    }
}