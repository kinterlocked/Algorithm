import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        int index = 0;
        int result = 0;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()) {
            arr[index++] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < N; i++) {
            for(int j = 1; j <= arr[i]; j++){
                if(arr[i]%j == 0){
                    count++;
                }
            }
            if(count == 2){
                result++;
            }
            count = 0;
        }
        System.out.println(result);
    }
}
