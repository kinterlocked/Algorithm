import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		
		char[] cArr = new char[line.length()];
		
		cArr = line.toCharArray();
		
		int i = Integer.parseInt(br.readLine());
		
		System.out.println(cArr[i-1]);
		
		
	}
}
