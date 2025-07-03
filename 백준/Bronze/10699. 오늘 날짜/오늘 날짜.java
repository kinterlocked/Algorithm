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
                StringTokenizer st;
                StringBuilder sb = new StringBuilder();

                Date date = new Date();
                DateFormat day = new SimpleDateFormat("YYYY-MM-dd");
                day.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
                System.out.println(day.format(date));
            }
        }