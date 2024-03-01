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
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[][] arr = new int[1001][1001];
		int[] countArr = new int[N];
		
		// 색종이 크기 입력
		for (int n = 1; n <= N; n++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());

			for (int i = x; i < x + p; i++) {
				for (int j = y; j < y + q; j++) {
					arr[i][j] = n;
				}
			}
		}
		
		int index = 0;
		for (int n = 1; n <= N; n++) {
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j] == n) {
						count++;
					}
				}

			}
			countArr[index] = count;
			index++;
		}

		for (int result : countArr) {
			System.out.println(result);
		}
	}
}