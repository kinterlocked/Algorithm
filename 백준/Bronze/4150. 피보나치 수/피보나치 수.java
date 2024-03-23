import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		BigInteger[] arr = new BigInteger[N + 1];

		arr[0] = BigInteger.valueOf(0);
		arr[1] = BigInteger.valueOf(1);

		BigInteger result = BigInteger.valueOf(0);
		if (N > 1) {
			arr[2] = BigInteger.valueOf(1);
		}
		for (int i = 3; i < arr.length; i++) {
			arr[i] = arr[i - 1].add(arr[i - 2]);
		}
		System.out.println(arr[N]);
	}
}