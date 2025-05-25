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

                int a = Integer.parseInt(br.readLine());
                int b = Integer.parseInt(br.readLine());
                int c = Integer.parseInt(br.readLine());

                if(a+b+c != 180){
                    System.out.println("Error");
                }else{
                    if(a == 60 && b == 60 && c == 60){
                        System.out.println("Equilateral");
                    }else if(a != b && b != c && c != a){
                        System.out.println("Scalene");
                    }else{
                        System.out.println("Isosceles");
                    }
                }
            }
        }

