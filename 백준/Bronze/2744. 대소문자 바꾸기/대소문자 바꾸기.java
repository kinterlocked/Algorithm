        import org.w3c.dom.ls.LSOutput;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.math.BigInteger;
        import java.util.StringTokenizer;

        public class Main {
            public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringBuilder sb = new StringBuilder();

                String word = br.readLine();

                for(int i = 0; i < word.length(); i++) {
                    if (Character.isUpperCase(word.charAt(i))) {
                        sb.append(Character.toLowerCase(word.charAt(i)));
                    } else {
                        sb.append(Character.toUpperCase(word.charAt(i)));
                    }
                }
                System.out.print(sb.toString());
            }
        }

