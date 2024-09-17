import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[] arr = new int[3];
        int x;
        int y;
        int z;
        int index = 0;
        while(true){
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            arr[index++] = x;
            y = Integer.parseInt(st.nextToken());
            arr[index++] = y;
            z = Integer.parseInt(st.nextToken());
            arr[index++] = z;

            Arrays.sort(arr);

            if(x==0 && y==0 && z==0){
                break;
            }else if(((arr[0]*arr[0])+(arr[1]*arr[1])) == (arr[2]*arr[2])){
                sb.append("right").append("\n");
                index = 0;
            }else{
                sb.append("wrong").append("\n");
                index = 0;
            }
        }
        System.out.println(sb.toString());
    }
}
