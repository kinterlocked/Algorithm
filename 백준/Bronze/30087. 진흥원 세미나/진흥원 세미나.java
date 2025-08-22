import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
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

        HashMap<String, String> map = new HashMap<>();
        map.put("Algorithm","204");
        map.put("DataAnalysis","207");
        map.put("ArtificialIntelligence","302");
        map.put("CyberSecurity","B101");
        map.put("Network","303");
        map.put("Startup","501");
        map.put("TestStrategy","105");

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            String word = br.readLine();
            if(map.containsKey(word)) {
                sb.append(map.get(word) + "\n");
            }
        }
        System.out.println(sb.toString());
    }
}