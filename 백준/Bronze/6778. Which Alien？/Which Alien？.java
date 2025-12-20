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

        System.out.print("");
        int antenna = sc.nextInt();
        int eyes = sc.nextInt();

        if(antenna>=3 && eyes<5) {
            System.out.println("TroyMartian");
        }
        if(antenna<7 && eyes>=2) {
            System.out.println("VladSaturnian");
        }
        if(antenna<3 && eyes<4) {
            System.out.println("GraemeMercurian");
        }

    }
}