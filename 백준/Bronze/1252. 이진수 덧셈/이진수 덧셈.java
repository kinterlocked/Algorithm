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
                StringTokenizer st = new StringTokenizer(br.readLine());
                StringBuilder sb = new StringBuilder();

                String bit1 = st.nextToken();
                String bit2 = st.nextToken();

                BigInteger a = new BigInteger(bit1, 2);
                BigInteger b = new BigInteger(bit2, 2);
                BigInteger sum = a.add(b);

                System.out.println(sum.toString(2));
            }
        }