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
//                StringTokenizer st = new StringTokenizer(br.readLine());
                StringBuilder sb = new StringBuilder();

                int result = 0;
                for(int i = 0; i < 5; i++){
                    int grade = Integer.parseInt(br.readLine());
                    if(grade < 40){
                        result += 40;
                    }else{
                        result += grade;
                    }
                }
                System.out.println(result / 5);
            }
        }