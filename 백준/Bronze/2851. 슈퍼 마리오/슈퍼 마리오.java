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

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum == 100) {
				break;
			} else if (sum > 100) {
				int after = sum;
				int before = after - arr[i];
				int ch1 = after - 100;
				int ch2 = 100 - before;
				if (ch1 == ch2) {
					sum = after;
					break;
				} else if (ch1 > ch2) {
					sum = before;
					break;
				} else if (ch1 < ch2) {
					sum = after;
					break;
				}

			}
		}
		System.out.println(sum);
	}
}