    import org.w3c.dom.ls.LSOutput;

    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.math.BigInteger;
    import java.util.StringTokenizer;

    public class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            System.out.println(B - A + " " + B);
        }
    }
