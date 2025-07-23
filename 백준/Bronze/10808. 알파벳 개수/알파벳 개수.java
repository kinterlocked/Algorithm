import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

       String word = br.readLine();
       int[] count  = new int[26];
       for (int i = 0; i < word.length(); i++) {
           count[word.charAt(i) - 'a']++;
       }
       for(int i = 0; i < count.length; i++) {
           sb.append(count[i] + " ");
       }
        System.out.println(sb.toString());
    }
}