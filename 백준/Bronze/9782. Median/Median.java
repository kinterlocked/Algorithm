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
        int tc = 1;
        while(T != 0){
            double[] arr = new double[T];
            int index = 0;
            while(st.hasMoreTokens()){
                arr[index++] = Double.parseDouble(st.nextToken());
            }
            if(T % 2 != 0){
                sb.append("Case " + tc + ": " + arr[T/2] + "\n");
            }else{
                sb.append("Case " + tc + ": " +  (arr[T/2]+ arr[(T/2)-1]) / 2  + "\n");
            }
            tc++;
            st = new StringTokenizer(br.readLine());
            T = Integer.parseInt(st.nextToken());
        }
        System.out.println(sb.toString());
    }
}