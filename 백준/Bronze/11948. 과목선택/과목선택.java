import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

       int[] arr = new int[4];
       int[] arr2 = new int[2];

       for(int i = 0; i < 4; i++) {
           arr[i] = Integer.parseInt(br.readLine());
       }
       for(int i = 0; i < 2; i++) {
           arr2[i] = Integer.parseInt(br.readLine());
       }
       Arrays.sort(arr);
       Arrays.sort(arr2);
       int result = 0;
       for(int i = 1; i < 4; i++){
           result += arr[i];
       }
       result += arr2[1];
        System.out.println(result);
    }
}