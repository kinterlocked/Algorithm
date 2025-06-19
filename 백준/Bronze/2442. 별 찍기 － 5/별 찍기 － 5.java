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

                int N = Integer.parseInt(br.readLine());

                for(int i = 1; i <= N; i++) {
                    for(int j = 0; j < N - i; j++) {
                        System.out.print(" ");
                    }
                    for(int j = 1; j < 2 * i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }