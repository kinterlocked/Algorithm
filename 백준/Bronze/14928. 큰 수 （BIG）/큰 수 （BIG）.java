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

                String n = br.readLine();
                long remainder = 0;
                for (int i = 0; i < n.length(); i++) {
                    remainder = (remainder * 10 + (n.charAt(i) - '0')) % 20000303;
                }
                System.out.println(remainder);
            }
        }