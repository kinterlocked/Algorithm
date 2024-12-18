import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int a;
        int b;
        while(true){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0){
                break;
            }else{
                if(a > b){
                    sb.append("Yes").append("\n");
                }else{
                    sb.append("No").append("\n");
                }
            }
        }
        System.out.println(sb.toString());
    }
}
