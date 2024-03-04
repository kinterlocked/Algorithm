import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int M = N - K;
	
		int nFac = 1;
		int kFac = 1;
		int mFac = 1;
		
		for(int i = 1; i <= N; i++) {
			nFac *= i;
		}
		for(int i = 1; i <= K; i++) {
			kFac *= i;
		}		
		for(int i = 1; i <= M; i++) {
			mFac *= i;
		}	
		int result = nFac / (kFac * mFac);
		System.out.println(result);
	}	
}
