import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String word = br.readLine();
        int[] arr= new int[2];
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == '0') {
                arr[0]++;
            }else{
                arr[1]++;
            }
        }
        int zero = arr[0] / 2;
        int one = arr[1] / 2;
        int zCount = 0;
        int oCount = 0;
        sb.append(word);
        for(int i = sb.length() - 1; i >= 0; i--) {
            if(sb.charAt(i) == '0') {
                sb.deleteCharAt(i);
                zCount++;
                if(zCount == zero) {
                    break;
                }
            }
        }
        for(int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == '1') {
                sb.deleteCharAt(i);
                oCount++;
                i--;
                if(oCount == one) {
                    break;
                }
            }
        }
        System.out.println(sb.toString());
    }
}
