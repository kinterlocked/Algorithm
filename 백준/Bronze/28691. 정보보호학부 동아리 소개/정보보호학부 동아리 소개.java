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

        String word = br.readLine();
        
        if (word.equals("M")) {
            System.out.println("MatKor");
        } else if (word.equals("W")) {
            System.out.println("WiCys");
        } else if (word.equals("C")) {
            System.out.println("CyKor");
        } else if (word.equals("A")) {
            System.out.println("AlKor");
        } else {
            System.out.println("$clear");
        }
    }
}