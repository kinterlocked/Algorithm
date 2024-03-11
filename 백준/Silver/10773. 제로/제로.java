import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		Deque<Integer> q = new ArrayDeque<>();
		
		for(int k = 0; k < K; k++) {
			int N = Integer.parseInt(br.readLine());
			
			if(N != 0) {
				q.offerLast(N);
			}else {
				q.pollLast();
			}
		}
		int sum = 0;
		while(!q.isEmpty()) {
			sum += q.pollLast();
		}
		System.out.println(sum);
	}
}
