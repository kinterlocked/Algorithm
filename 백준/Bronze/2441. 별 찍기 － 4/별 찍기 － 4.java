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

                for(int i = 0; i < N; i++) {
                    for(int k = 0; k < i; k++){
                        System.out.print(" ");
                    }
                    for(int j = N - i; j > 0; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }