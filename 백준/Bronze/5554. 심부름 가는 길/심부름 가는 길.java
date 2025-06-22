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

                int time = 0;
                for(int i = 0; i < 4; i++){
                    time += Integer.parseInt(br.readLine());
                }
                sb.append(time/60 + "\n" + time%60).append("\n");
                System.out.println(sb.toString());
            }
        }