        import org.w3c.dom.ls.LSOutput;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.math.BigInteger;
        import java.util.Arrays;
        import java.util.StringTokenizer;

        public class Main {
            public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st = new StringTokenizer(br.readLine());
                StringBuilder sb = new StringBuilder();

                int L = Integer.parseInt(st.nextToken());
                int P = Integer.parseInt(st.nextToken());

                int temp = L * P;
                st = new StringTokenizer(br.readLine());
                while(st.hasMoreTokens()) {
                   sb.append(Integer.parseInt(st.nextToken()) - temp + " ");
               }
                System.out.println(sb.toString());
            }
        }

