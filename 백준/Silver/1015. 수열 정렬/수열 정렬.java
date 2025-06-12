import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] P = new int[N];
        Node[] A = new Node[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(st.nextToken());
            A[i] = new Node(val, i);
        }

        Arrays.sort(A, Comparator.comparingInt(p -> p.value));

        for (int i = 0; i < N; i++) {
            P[A[i].index] = i;
        }
        
        for (int i = 0; i < N; i++) {
            sb.append(P[i]).append(" ");
        }
        System.out.println(sb.toString());
    }
}
class Node {
    int value;
    int index;
    public Node(int value, int index) {
        this.value = value;
        this.index = index;
    }
}