        import org.w3c.dom.ls.LSOutput;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.math.BigInteger;
        import java.text.DateFormat;
        import java.text.SimpleDateFormat;
        import java.util.Arrays;
        import java.util.Date;
        import java.util.StringTokenizer;
        import java.util.TimeZone;

        public class Main {
            public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st = new StringTokenizer(br.readLine());
                StringBuilder sb = new StringBuilder();

                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());

                sb.append((A+B)*(A-B)).append("\n");
                System.out.println(sb.toString());
            }
        }