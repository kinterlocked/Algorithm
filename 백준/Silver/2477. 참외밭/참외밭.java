import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, Integer> cMap = new HashMap<>();
        HashMap<Integer, Integer> rMap = new HashMap<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 참외 수량
        int K = Integer.parseInt(br.readLine());
        int i = 1;
        int l = 0;
        int[] arr = new int[6]; // 필요한 경우만 배열을 사용

        for (int tc = 0; tc < 6; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
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
        int count = 0;

        while (count < 6) {
            if (arr[q] == cMax || arr[q] == rMax) {
                int nextIndex = (q + 1) % 6;
                if (arr[nextIndex] == cMax || arr[nextIndex] == rMax) {
                    int min1 = arr[(q + 3) % 6];
                    int min2 = arr[(q + 4) % 6];
                    minsq = min1 * min2;
                    break;
                }
                q = nextIndex;
                count++;
            }
            q = (q + 1) % 6;
            count++;
        }

        int result = square - minsq;
        System.out.println(result * K);
    }
}
