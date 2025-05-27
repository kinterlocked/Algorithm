        import org.w3c.dom.ls.LSOutput;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.math.BigInteger;
        import java.util.Arrays;
        import java.util.StringTokenizer;

        public class Main {
            public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st;
                StringBuilder sb = new StringBuilder();

                String name;
                int age, weight;
                while(true){
                    st = new StringTokenizer(br.readLine());
                    name = st.nextToken();
                    age = Integer.parseInt(st.nextToken());
                    weight = Integer.parseInt(st.nextToken());
                    if(name.equals("#")){
                        break;
                    }
                    if(age > 17 || weight >= 80){
                        sb.append(name).append(" ").append("Senior").append("\n");
                    }else{
                        sb.append(name).append(" ").append("Junior").append("\n");
                    }
                }
                System.out.println(sb.toString());
            }
        }

