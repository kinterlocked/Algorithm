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

		String line = br.readLine();

		char[] cArr = new char[line.length()];

		Deque<Character> q1 = new ArrayDeque<>();

		cArr = line.toCharArray();

		// System.out.println(Arrays.toString(cArr));

		int index = 0;
		while (index < line.length()) {
			if (cArr[index] == '<') {
				while (cArr[index] != '>') {
					System.out.print(cArr[index]);
					index++;
				}
				System.out.print(cArr[index]);
				if (index < cArr.length) {
					index++;
				}
			} else {
				while (index < cArr.length  && cArr[index ] != ' ' && cArr[index] != '<') {
					q1.offerLast(cArr[index]);
					index++;
				}
				while (!q1.isEmpty()) {
					System.out.print(q1.pollLast());
				}
				if (index < cArr.length && cArr[index] == ' ') {
					System.out.print(cArr[index]);
					index++;
				}
			}
		}
	}
}