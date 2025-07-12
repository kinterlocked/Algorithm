        import org.w3c.dom.ls.LSOutput;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.math.BigInteger;
        import java.text.DateFormat;
        import java.text.SimpleDateFormat;
        import java.util.Arrays;
        import java.util.Date;
        import java.util.StringTokenizer;
        import java.util.TimeZone;

        public class Main {
            public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                StringTokenizer st = new StringTokenizer(br.readLine());
                StringBuilder sb = new StringBuilder();

                char name = br.readLine().charAt(0);

                if(name == 'n' || name == 'N') {
                    System.out.println("Naver D2");
                }else{
                    System.out.println("Naver Whale");
                }
            }
        }