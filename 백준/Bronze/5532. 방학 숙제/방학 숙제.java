        import org.w3c.dom.ls.LSOutput;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.math.BigInteger;
        import java.util.Arrays;
        import java.util.Date;
        import java.util.StringTokenizer;

        public class Main {
            public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                int L = Integer.parseInt(br.readLine());
                int A = Integer.parseInt(br.readLine());
                int B = Integer.parseInt(br.readLine());
                int C = Integer.parseInt(br.readLine());
                int D = Integer.parseInt(br.readLine());

                int day = 0;
                while(A > 0 || B > 0){
                    A -= C;
                    B -= D;
                    day++;
                }
                System.out.println(L - day);
            }
        }

