import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        if(S == 1){
            System.out.println(280);
        }else if(T >= 12 && T <= 16){
            System.out.println(320);
        }else{
            System.out.println(280);
        }
    }
}