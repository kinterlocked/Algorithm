        import org.w3c.dom.ls.LSOutput;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.math.BigInteger;
        import java.util.Arrays;
        import java.util.StringTokenizer;

        public class Main {
            public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                int N = Integer.parseInt(br.readLine());

                int num;
                int result = 0;
                int count = 1;
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int i = 0; i < N; i++) {
                    num = Integer.parseInt(st.nextToken());
                    if(num == 1){
                        result += count++;
                    }else{
                        count = 1;
                    }
                }
                System.out.println(result);
            }
        }

