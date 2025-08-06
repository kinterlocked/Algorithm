import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

       sb.append("#  # #### #### #  #\n" +
               "#### #  # #  # # #\n" +
               "#### #  # #  # # #\n" +
               "#  # #### #### #  #");
        System.out.println(sb.toString());
    }
}