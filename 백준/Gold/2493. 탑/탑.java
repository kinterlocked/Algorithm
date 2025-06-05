import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Deque<int[]> stack = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            int height = arr[i];

            while (!stack.isEmpty()) {
                if (stack.peekLast()[1] >= height) {
                    sb.append(stack.peekLast()[0]).append(" ");
                    break;
                }
                stack.pollLast();
            }

            if (stack.isEmpty()) {
                sb.append("0 ");
            }

            stack.offerLast(new int[]{i + 1, height});
        }
        System.out.println(sb.toString());
    }
}
