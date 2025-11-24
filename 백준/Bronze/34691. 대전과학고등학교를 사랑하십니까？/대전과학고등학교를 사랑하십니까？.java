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

        while (true) {
            String line = br.readLine();
            if (line.equals("end")) break;
            System.out.println(solution(line));
        }
    }

    static String solution(String str) {
        if (str.equals("animal")) return "Panthera tigris";
        if (str.equals("flower")) return "Forsythia koreana";
        return "Pinus densiflora";
    }
}
