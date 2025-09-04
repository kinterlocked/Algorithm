import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        int aCount = 0;
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == 'a') {
                aCount++;
            }
        }
        if (aCount == 0 || aCount == word.length()) {
            System.out.println(0);
            return;
        }

        int current = 0;
        for (int i = 0; i < aCount; i++) {
            if (word.charAt(i) == 'a') current++;
        }

        int max = current;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt((i - 1) % word.length()) == 'a'){
                current--;
            }
            if (word.charAt((i + aCount - 1) % word.length()) == 'a'){
                current++;
            }
            max = Math.max(max, current);
        }
        System.out.println(aCount - max);
    }
}