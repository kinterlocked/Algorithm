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
                StringTokenizer st;

                for(int i = 0; i < 3; i++){
                    st = new StringTokenizer(br.readLine());
                    int h1 = Integer.parseInt(st.nextToken());
                    int m1 = Integer.parseInt(st.nextToken());
                    int s1 = Integer.parseInt(st.nextToken());

                    int h2 = Integer.parseInt(st.nextToken());
                    int m2 = Integer.parseInt(st.nextToken());
                    int s2 = Integer.parseInt(st.nextToken());

                    int start = h1 * 3600 + m1 * 60 + s1;
                    int end = h2 * 3600 + m2 * 60 + s2;

                    int time = end - start;

                    int h = time / 3600;
                    time %= 3600;
                    int m = time / 60;
                    int s = time % 60;

                    sb.append(h).append(" ").append(m).append(" ").append(s).append("\n");
                }
                System.out.println(sb.toString());
            }
        }