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
                if(N == 0) {
                    System.out.println(1);
                }else{
                    System.out.println(recursion(N , 1));
                }
            }
            static long recursion(int n, long result) {
                if(n == 1){
                    return result;
                }else{
                    result *= n;
                    return recursion(n-1, result);
                }
            }
        }

