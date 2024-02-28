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
		int len = line.length();
		int row = 1;
		int col = 0;
		int test = 0;
		for (int i = 1; i <= len / 2; i++) {
			if (len % i == 0) {
				test = len / i;
				if(test > row) {
					row = i;
					col = test;
				}
			}
		}
		char[][] arr = new char[row][col];

		int index = 0;
		for (int j = 0; j < arr[0].length; j++) {
			for (int i = 0; i < arr.length; i++) {
				arr[i][j] = line.charAt(index);
				index++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
			}
		}
		
	}
}