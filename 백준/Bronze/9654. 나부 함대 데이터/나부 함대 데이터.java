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

                sb.append("SHIP NAME      CLASS          DEPLOYMENT IN SERVICE\n" +
                        "N2 Bomber      Heavy Fighter  Limited    21        \n" +
                        "J-Type 327     Light Combat   Unlimited  1         \n" +
                        "NX Cruiser     Medium Fighter Limited    18        \n" +
                        "N1 Starfighter Medium Fighter Unlimited  25        \n" +
                        "Royal Cruiser  Light Combat   Limited    4         ");

                System.out.println(sb.toString());
            }
        }