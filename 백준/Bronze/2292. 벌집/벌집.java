import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int end = Integer.parseInt(br.readLine());
		
		int result = 1;
		int count = 1;
		
		while(result < end) {
			result += count * 6;
			count++;
		}
		System.out.println(count);
	}
}
