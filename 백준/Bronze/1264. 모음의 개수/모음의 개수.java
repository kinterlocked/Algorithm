        import org.w3c.dom.ls.LSOutput;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.math.BigInteger;
        import java.util.Arrays;
        import java.util.StringTokenizer;

        public class Main {
            public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringBuilder sb = new StringBuilder();

                String line;
                int result;
                while (true) {
                    line = br.readLine();
                    if (line.equals("#")) {
                        break;
                    }
                    result = 0;
                    for(int i = 0; i < line.length(); i++) {
                        if(line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o' || line.charAt(i) == 'u'
                                || line.charAt(i) == 'A' || line.charAt(i) == 'E' || line.charAt(i) == 'I' || line.charAt(i) == 'O' || line.charAt(i) == 'U') {
                            result ++;
                        }
                    }
                    sb.append(result).append("\n");
                }
                System.out.println(sb.toString());
            }
        }

