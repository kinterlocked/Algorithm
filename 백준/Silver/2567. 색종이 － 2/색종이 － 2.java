import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	static int count = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int[][] arr = new int[101][101];
		for (int tc = 0; tc < T; tc++) {
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			for (int i = a; i < a + 10; i++) {
				for (int j = b; j < b + 10; j++) {
					arr[i][j] = 1;
				}
			}
		}
		
//		for(int i = 0; i < arr.length; i++) {
//			for(int  j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[1].length; j++) {
				if (arr[i][j] == 1) {
					int dx[] = { -1, 1, 0, 0 };
					int dy[] = { 0, 0, 1, 1 };

					for (int k = 0; k < 4; k++) {

						int nx = i + dx[k];
						int ny = j + dy[k];

						if (nx < 0 || nx > 100 || ny < 0 || ny > 100 || arr[nx][ny] == 0 ) {
							count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}