import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

       int N = Integer.parseInt(br.readLine());
       String word;
       for(int i = 0; i < N; i++) {
           word = br.readLine();
           sb.append(word.toLowerCase() + "\n");
       }
        System.out.println(sb.toString());
    }
}