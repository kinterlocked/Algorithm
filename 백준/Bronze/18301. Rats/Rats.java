import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n1 = Integer.parseInt(st.nextToken()) + 1;
        int n2 = Integer.parseInt(st.nextToken()) + 1;
        int n3 = Integer.parseInt(st.nextToken()) + 1;

        int result = ((n1 * n2) / n3) - 1;

        System.out.println(result);
    }
}