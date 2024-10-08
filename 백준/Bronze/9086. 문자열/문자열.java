import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        String line;
        for(int t = 0; t < T; t++) {
            line = br.readLine();
            sb.append(line.charAt(0)).append(line.charAt(line.length()-1)).append('\n');
        }
        System.out.println(sb.toString());
    }
}