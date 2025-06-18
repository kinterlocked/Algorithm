import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        String bomb = br.readLine();

        for(int i = 0; i < line.length(); i++) {
            sb.append(line.charAt(i));
            if(sb.length() >= bomb.length() && sb.charAt(sb.length() - 1) == bomb.charAt(bomb.length() - 1)) {
                boolean chk = true;
                for(int j = 0; j < bomb.length(); j++) {
                    if(sb.charAt(sb.length() - bomb.length() + j) != bomb.charAt(j)) {
                        chk = false;
                        break;
                    }
                }
                if(chk) {
                    for(int k = 0; k < bomb.length(); k++) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                }
            }
        }
        if(sb.length() == 0){
            System.out.println("FRULA");
        }else{
            System.out.println(sb.toString());
        }
    }
}
