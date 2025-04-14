    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.math.BigInteger;
    import java.util.StringTokenizer;

    public class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int N = Integer.parseInt(br.readLine());
            String line;
            for(int i = 1; i <= N; i++) {
                line = br.readLine();
                sb.append(i).append(". ").append(line).append("\n");
            }
            System.out.println(sb.toString());
        }
    }
