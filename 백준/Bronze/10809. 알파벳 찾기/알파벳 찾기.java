import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();

		int[] arr = new int[26];

		Arrays.fill(arr, -1);

		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i); 

			if (arr[ch - 'a'] == -1) { 
				arr[ch - 'a'] = i;
			}
		}
		for (int result : arr) {
			System.out.print(result + " ");
		}

	}
}
