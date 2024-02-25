import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		LinkedList<String> list = new LinkedList<>();
		String sit = br.readLine();
		StringTokenizer st = new StringTokenizer(sit, "SLL", true);
		int count = 1;
		int lcount = 0;
		while (st.hasMoreTokens()) {
			{
				list.offer(st.nextToken());
			}
		}
		// 컵 홀더 쓸 수 있는 사람 수
		for (int j = 0; j < list.size(); j++) {
			count++;
			if(list.get(j).equals("L")) {
				count -= lcount;
				lcount++;
				if(lcount == 2) {
					lcount = 0;
				}
			}
			if (count >= N) {
				count = N;
			}
		}

		System.out.println(count);
	}
}