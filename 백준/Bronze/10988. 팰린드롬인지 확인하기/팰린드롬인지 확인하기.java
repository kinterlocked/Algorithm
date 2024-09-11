import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         String line = br.readLine();
         boolean chk = true;

         for(int i = 0; i < line.length()/2; i++) {
             if(line.charAt(i) != line.charAt(line.length()-i-1)) {
                 chk =false;
                 break;
             }else if(line.charAt(i) == line.charAt(line.length()-i-1)) {
                 chk = true;
             }
         }
         if(chk) {
             System.out.println("1");
         } else if (!chk) {
             System.out.println("0");
         }
    }
}
