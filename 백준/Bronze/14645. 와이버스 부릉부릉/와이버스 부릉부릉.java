    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.math.BigInteger;
    import java.util.StringTokenizer;

    public class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

           int N = Integer.parseInt(st.nextToken());
           int K = Integer.parseInt(st.nextToken());

           for(int i = 1; i <= N; i++){
               st = new StringTokenizer(br.readLine());
           }
            System.out.println("비와이");
        }
    }
