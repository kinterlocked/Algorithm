    import org.w3c.dom.ls.LSOutput;

    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.math.BigInteger;
    import java.util.StringTokenizer;

    public class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String line = br.readLine();
            String line2 = br.readLine();

            if(line.length() < line2.length()) {
                System.out.println("no");
            }else{
                System.out.println("go");
            }
        }
    }
