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

		for (int i = 0; i < T; i++) {
			int sum = 0;
			String line = br.readLine();
			char[] cArr;
			cArr = line.toCharArray();

			int count = 0;
			for (int j = 0; j < cArr.length; j++) {
				if(cArr[j] == 'O') {
					sum += ++count;
				}else {
					count = 0;
				}
			}
			System.out.println(sum);
		}
	}
}