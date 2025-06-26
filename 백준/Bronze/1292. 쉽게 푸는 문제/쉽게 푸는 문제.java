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
                StringTokenizer st = new StringTokenizer(br.readLine());
                StringBuilder sb = new StringBuilder();

                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());

                int arr[] = new int[1000];
                int num = 1;
                int count = 0;
                
                for (int i = 0; i < 1000; i++){
                    if(count == num){
                        num++;
                        count = 1;
                        arr[i] = num;
                    }
                    else {
                        count++;
                        arr[i] = num;
                    }
                }
                
                int result = 0;
                for (int i = A-1; i < B; i++){
                    result += arr[i];
                }
                System.out.println(result);
            }
        }