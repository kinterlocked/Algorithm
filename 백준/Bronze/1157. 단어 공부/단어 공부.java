import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         String line = br.readLine();
         int[] count = new int[26];
         boolean check = false;
         int max = 0;
         int result = 0;
         for(int i = 0; i < line.length(); i++) {
             if(line.charAt(i) >= 'A' && line.charAt(i) <= 'Z') {
                 count[line.charAt(i) - 'A']++;
             }else if(line.charAt(i) >= 'a' && line.charAt(i) <= 'z') {
                 count[line.charAt(i) - 'a']++;
             }
         }
         for(int i = 0; i < 26; i++) {
             if(count[i] > max) {
                 max = count[i];
                 check = false;
                 result = i;
             }else if(count[i] == max) {
                 check = true;
             }
         }

         if(check == true){
             System.out.println("?");
         }else{
             System.out.println((char)(result + 'A'));
         }
    }
}