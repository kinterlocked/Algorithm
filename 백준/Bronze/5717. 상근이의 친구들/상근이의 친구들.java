    import org.w3c.dom.ls.LSOutput;

    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.math.BigInteger;
    import java.util.StringTokenizer;

    public class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();

            int M = Integer.parseInt(st.nextToken());
            int F = Integer.parseInt(st.nextToken());
            while(M != 0 && F != 0){
                sb.append(M+F).append("\n");
                st = new StringTokenizer(br.readLine());
                M = Integer.parseInt(st.nextToken());
                F = Integer.parseInt(st.nextToken());
            }
            System.out.println(sb.toString());
        }
    }
