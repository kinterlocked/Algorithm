import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		HashMap<Integer, Integer> cMap = new HashMap<>();
		HashMap<Integer, Integer> rMap = new HashMap<>();

		// 가로 세로 순 값 저장
		int[] arr = new int[6];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 참외 수량
		int K = Integer.parseInt(br.readLine());
		int i = 1;
		int l = 0;
		for (int tc = 0; tc < 6; tc++) {
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line);
			int k = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			if (k == 1 || k == 2) {
				rMap.put(i, v);
				arr[l] = v;
			} else {
				cMap.put(i, v);
				arr[l] = v;
			}
			i++;
			l++;
		}
		Integer cMax = Collections.max(cMap.values());
		Integer rMax = Collections.max(rMap.values());
		int square = cMax * rMax;
		int minsq = 0;
		int q = 0;
		int min1 = 0;
		int min2 = 0;
		int count = 0;
		
		// 가로, 세로 최대 값 붙어있을 때 다음 다음 값 2개가 뺄 값
		while(count < 6) {
			
			if(arr[q] == cMax || arr[q] == rMax) {
				int nIndex = (q + 1) % 6;
				if(arr[nIndex] == cMax || arr[nIndex] == rMax) {
					min1 = arr[(q+3)%6];
					min2 = arr[(q+4)%6];
					
					minsq = min1 * min2;
					
					break;
				}
				q = nIndex;
				count++;

			}
			q = (q + 1) % 6;
			count++;
		}
		int result = square - minsq;

		System.out.println(result * K);
	}
}