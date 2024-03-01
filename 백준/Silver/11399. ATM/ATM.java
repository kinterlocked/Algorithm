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

		int[] arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());

		int index = 0;
		while (st.hasMoreTokens()) {
			arr[index] = Integer.parseInt(st.nextToken());
			index++;
		}
		Arrays.sort(arr);
		int sum = 0;
		int[] result = new int[N];
		for (int i = 0; i < arr.length; i++) {
		sum = arr[i] + sum;
		result[i] = sum;
		}
		sum = 0;
		for(int i = 0; i < result.length; i++) {
			sum += result[i];
		}
		System.out.println(sum);	
	}
}