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

                String line;
                int[] counts = new int[26];
                int max = Integer.MIN_VALUE;
                while ((line = br.readLine()) != null) {
                    for (int i = 0; i < line.length(); i++) {
                        char c = line.charAt(i);
                        if (c >= 'a' && c <= 'z') {
                            counts[c - 'a']++;
                            max = Math.max(max, counts[c - 'a']);
                        }
                    }
                }

                for (int i = 0; i < 26; i++) {
                    if (counts[i] == max) {
                        sb.append((char)(i + 'a'));
                    }
                }
                System.out.println(sb.toString());
            }
        }