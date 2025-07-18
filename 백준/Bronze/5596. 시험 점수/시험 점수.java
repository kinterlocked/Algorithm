import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int S = 0;
        int T = 0;
        while (st.hasMoreTokens()) {
            S += Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            T += Integer.parseInt(st.nextToken());
        }
        if(T > S){
            System.out.println(T);
        }else{
            System.out.println(S);
        }
    }
}