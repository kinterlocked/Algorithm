import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        int[] arr= new int[2];
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == '0') {
                arr[0]++;
            }else{
                arr[1]++;
            }
        }
        String result = "";
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < (arr[i] / 2); j++){
                result += i;
            }
        }
        System.out.println(result);
    }
}
