import java.io.BufferedReader;
import java.io.InputStreamReader;
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

        int N = Integer.parseInt(br.readLine());
        String[] heart = {
                " @@@   @@@ ",
                "@   @ @   @",
                "@    @    @",
                "@         @",
                " @       @ ",
                "  @     @  ",
                "   @   @   ",
                "    @ @    ",
                "     @     "
        };
        for (int t = 0; t < N; t++) {        
            for (String row : heart) {
                sb.append(row).append('\n');  
            }
        }
        System.out.println(sb.toString());
    }
}