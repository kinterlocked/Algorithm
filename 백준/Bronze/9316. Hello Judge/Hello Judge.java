import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

       int N = Integer.parseInt(br.readLine());
       for(int i = 1; i <= N; i++) {
           sb.append("Hello World, Judge " + i +"!"+"\n");
       }
        System.out.println(sb.toString());
    }
}