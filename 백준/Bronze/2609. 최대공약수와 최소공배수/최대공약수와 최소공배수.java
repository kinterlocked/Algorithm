import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int euclid = euclid(a, b);
        int reult = (a * b) / euclid;

        System.out.println(euclid);
        System.out.println(reult);
    }

    private static int euclid(int a, int b) {
        if (b == 0) {
            return a;
        }
        return euclid(b, a % b);
    }
}
