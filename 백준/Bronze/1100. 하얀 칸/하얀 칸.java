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

                String line;
                int result = 0;
                for(int i = 0; i < 8; i++){
                    line = br.readLine();
                    if (i % 2 == 0) {
                        for(int j = 0; j < 8; j+=2) {
                            if (line.charAt(j) == 'F') {
                                result += 1;
                            }
                        }
                    }else{
                        for(int j = 1; j < 8; j+=2) {
                            if (line.charAt(j) == 'F') {
                                result += 1;
                            }
                        }
                    }
                }
                System.out.println(result);
            }
        }