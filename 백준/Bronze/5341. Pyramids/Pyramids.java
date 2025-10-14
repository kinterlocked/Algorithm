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

        int input = 0;
        while ( (input =  Integer.parseInt(br.readLine())) != 0 ) {
            int needNumberOfBlocks = 0;
            for (int i = 1 ; i <= input ; i++) {
                needNumberOfBlocks += i;
            }
            sb.append(String.valueOf( needNumberOfBlocks )).append("\n");
        }
        System.out.println(sb.toString());
    }
}