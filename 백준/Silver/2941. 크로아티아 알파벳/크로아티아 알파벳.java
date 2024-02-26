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

		String line = br.readLine();
		
		line = line.replace("c=" ,"c")
				.replace("c-","c").replace("dz=","d")
				.replace("d-","d").replace("lj","l")
				.replace("nj","n").replace("s=","s")
				.replace("z=","z");
		
		int result = line.length();
		
		System.out.println(result);
	}
}