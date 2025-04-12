import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());

        long result = 0;
        long len;
        while(N > 0){
            len = Long.toString(N).length();
            result += (N - Math.pow(10, len - 1) + 1) * len;
            N = (long)Math.pow(10, len - 1) - 1;
        }
        result += N;
        System.out.println(result % 1234567);
    }
}
