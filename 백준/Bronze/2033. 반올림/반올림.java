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
                StringBuilder sb = new StringBuilder();

                int N = Integer.parseInt(br.readLine());
                int num = 10;

                while (N >= num) {
                    int temp = N % num;
                    if (temp >= num / 2) {
                        N += num;
                    }
                    N = (N / num) * num;
                    num *= 10;
                }
                System.out.println(N);
            }
        }