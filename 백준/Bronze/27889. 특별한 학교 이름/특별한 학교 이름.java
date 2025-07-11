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

                String name = br.readLine();
                if(name.equals("NLCS")) {
                    System.out.println("North London Collegiate School");
                }else if(name.equals("BHA")){
                    System.out.println("Branksome Hall Asia");
                }else if(name.equals("KIS")){
                    System.out.println("Korea International School");
                }else{
                    System.out.println("St. Johnsbury Academy");
                }
            }
        }