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

        String line = br.readLine();
        char firstChar = line.charAt(0);

        if (firstChar == 'F') {
            System.out.println("Foundation");
        } else if (firstChar == 'C') {
            System.out.println("Claves");
        } else if (firstChar == 'V') {
            System.out.println("Veritas");
        } else if (firstChar == 'E') {
            System.out.println("Exploration");
        }
    }
}