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

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		// 방, 학생 수 확인
		int rCount = 0;
		int mCount = 0;
		int wCount = 0;

		int S; // 0은 여자 1은 남자
		int Y;
		int[] mGrade = new int[7];
		int[] wGrade = new int[7];
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			S = Integer.parseInt(st.nextToken());
			Y = Integer.parseInt(st.nextToken());

			if (S == 1) {
				mGrade[Y] += 1;

			} else if (S == 0) {
				wGrade[Y] += 1;
			}
		}
		for (int j = 1; j < mGrade.length; j++) {
			if (mGrade[j] % K == 0 && mGrade[j] > 0) {
				mCount += mGrade[j] / K;
			} else if (mGrade[j] % K != 0 && mGrade[j] > 0) {
				mCount += (mGrade[j] / K) + 1;
			}
		}
		for (int k = 1; k < wGrade.length; k++) {
			if (wGrade[k] % K == 0 && wGrade[k] > 0) {
				wCount += wGrade[k] / K;
			} else if ((wGrade[k] % K != 0 && wGrade[k] > 0)) {
				wCount += (wGrade[k] / K) + 1;
			}
		}

		rCount = wCount + mCount;
		System.out.println(rCount);
	}

}