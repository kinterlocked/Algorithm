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
		
		String line = br.readLine();
		
		char[] cArr = new char[line.length()];
		int[] arr = new int[line.length()];
		
		cArr = line.toCharArray();
		
		for(int i = 0; i < cArr.length; i++) {
			arr[i] = cArr[i] - '0';
		}
		Arrays.sort(arr);
		for(int j = arr.length - 1; j >= 0; j--) {
			System.out.print(arr[j]);
		}
		
	}
}