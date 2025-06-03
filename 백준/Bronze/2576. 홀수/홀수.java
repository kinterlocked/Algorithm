        import org.w3c.dom.ls.LSOutput;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.math.BigInteger;
        import java.util.Arrays;
        import java.util.StringTokenizer;

        public class Main {
            public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                int result = 0;
                int min = Integer.MAX_VALUE;
                for(int i = 0; i < 7; i++) {
                    int num = Integer.parseInt(br.readLine());
                    if(num % 2 != 0){
                        result += num;
                        min = Math.min(min, num);
                    }
                }
                if(min == Integer.MAX_VALUE){
                    System.out.println(-1);
                }else {
                    System.out.println(result);
                    System.out.println(min);
                }
            }
        }

