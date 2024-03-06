import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		Deque<Integer> q1 = new ArrayDeque<>();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());

			switch (a) {

			case 1:
				int b = Integer.parseInt(st.nextToken());
				q1.offerLast(b);
				break;

			case 2:
				if (q1.size() != 0) {
					sb.append(q1.pollLast()).append("\n");
				} else {
					sb.append("-1").append("\n");
				}
				break;
			case 3:
				sb.append(q1.size()).append("\n");
				break;
			case 4:
				if (q1.size() == 0) {
					sb.append("1").append("\n");
				} else {
					sb.append("0").append("\n");
				}
				break;
			case 5:
				if (q1.size() != 0) {
					sb.append(q1.peekLast()).append("\n");
				} else {
					sb.append("-1").append("\n");
				}
				break;

			}
		}
		System.out.println(sb);
	}
}
