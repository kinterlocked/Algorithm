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
                StringTokenizer st;
                StringBuilder sb = new StringBuilder();

                int t = Integer.parseInt(br.readLine());
                long x,y;
                for(int tc = 0; tc < t; tc++) {
                    st = new StringTokenizer(br.readLine());
                    x = Long.parseLong(st.nextToken());
                    y = Long.parseLong(st.nextToken());
                    sb. append(x + y + "\n");
                }
                System.out.println(sb.toString());
            }
        }