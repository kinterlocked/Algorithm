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
       int result = 0;
       for(int i = 0; i < word.length(); i++) {
           if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'|| word.charAt(i) == 'o' || word.charAt(i) == 'u') {
               result ++;
           }
       }
        System.out.println(result);
    }
}