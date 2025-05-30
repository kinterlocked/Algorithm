import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Deque<Integer> q = new ArrayDeque<>();

        for(int i=1; i<=N; i++) {
            q.offerLast(i);
        }

        sb.append("<");
        while(!q.isEmpty()){
            for(int i=0; i<K-1; i++){
                q.offerLast(q.pollFirst());
            }
            sb.append(q.pollFirst());
            if(!q.isEmpty()) {
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb.toString());
    }
}
