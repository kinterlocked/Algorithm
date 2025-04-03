    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.math.BigInteger;
    import java.util.StringTokenizer;

    public class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();

            BigInteger n = new BigInteger(st.nextToken());
            BigInteger m = new BigInteger(st.nextToken());

            sb.append(n.divide(m)).append("\n").append(n.remainder(m));
            System.out.println(sb.toString());

        }
    }
