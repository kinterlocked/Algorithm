import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] num = new int[9];
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			num[i]  = Integer.parseInt(br.readLine());	
			sum += num[i];
		}
		Arrays.sort(num);
		start : for(int i = 0; i < num.length; i++) {
			for(int j = i + 1; j <num.length; j++) {
				if((sum - num[i]- num[j] == 100)){
					num[i] = 0;
					num[j] = 0;
					break start;
				}
			}
		}
		for(int i = 0; i < num.length; i++) {
			if(num[i] != 0) {
				System.out.println(num[i]);
			}
		}
	}
}
