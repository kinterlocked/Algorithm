    import org.w3c.dom.ls.LSOutput;

    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.math.BigInteger;
    import java.util.StringTokenizer;

    public class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = "    8888888888  888    88888\n" +
                    "   88     88   88 88   88  88\n" +
                    "    8888  88  88   88  88888\n" +
                    "       88 88 888888888 88   88\n" +
                    "88888888  88 88     88 88    888888\n" +
                    "\n" +
                    "88  88  88   888    88888    888888\n" +
                    "88  88  88  88 88   88  88  88\n" +
                    "88 8888 88 88   88  88888    8888\n" +
                    " 888  888 888888888 88  88      88\n" +
                    "  88  88  88     88 88   88888888";

            System.out.println(str);
        }
    }
