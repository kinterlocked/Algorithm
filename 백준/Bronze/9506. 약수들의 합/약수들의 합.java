import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = 0;
        int temp = 0;
        n = Integer.parseInt(br.readLine());
        while (n != -1) {
            sb.append(n).append(" = ");
            for(int i = 1; i < n; i++){
                if(n % i == 0){
                    sb.append(i);
                    temp += i;
                }
                if(temp < n && n % i == 0){
                    sb.append(" + ");
                }
            }
            if(temp == n){
                System.out.println(sb.toString());
                sb = new StringBuilder();
                temp = 0;
                n = Integer.parseInt(br.readLine());
            }else{
                System.out.println(n + " is NOT perfect.");
                sb = new StringBuilder();
                temp = 0;
                n = Integer.parseInt(br.readLine());
            }
        }
    }
}
