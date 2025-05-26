        import org.w3c.dom.ls.LSOutput;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.math.BigInteger;
        import java.util.Arrays;
        import java.util.StringTokenizer;

        public class Main {
            public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st = new StringTokenizer(br.readLine());
                StringBuilder sb = new StringBuilder();

                int[] arr = new int[3];
                for(int i = 0; i < 3; i++) {
                    arr[i] = Integer.parseInt(st.nextToken());
                }
                Arrays.sort(arr);
                for(int i = 0; i < 3; i++) {
                    sb.append(arr[i]).append(" ");
                }
                System.out.println(sb.toString());
            }
        }

