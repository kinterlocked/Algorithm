import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            q.offerFirst(i);
        }
        while (!q.isEmpty()) {
            if(q.size() > 1) {
                q.pollLast();
                q.offerFirst(q.pollLast());
            }else {
                System.out.println(q.pollLast());
            }
        }
    }
}
