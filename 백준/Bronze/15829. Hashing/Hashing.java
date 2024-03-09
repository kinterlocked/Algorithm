import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

	public static boolean[] prime;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int L = Integer.parseInt(br.readLine());
		String line = br.readLine();
		
		BigInteger result = new BigInteger("0");
		for (int i = 0; i < L; i++) {
			result = result.add(BigInteger.valueOf(line.charAt(i) - 96).multiply(BigInteger.valueOf(31).pow(i)));
		}
		System.out.println(result.remainder(BigInteger.valueOf(1234567891)));
	}
}