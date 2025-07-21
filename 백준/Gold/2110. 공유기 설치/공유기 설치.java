import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] house = new int[N];
        for (int i = 0; i < N; i++) {
            house[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(house);

        int result =  Binary(house, C);
        System.out.println(result);
    }
    private static int Binary(int[] house, int C) {
        int left = 1;
        int right = house[house.length - 1] - house[0];
        int result = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (isPossible(house, C, mid)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
    static boolean isPossible(int[] house, int C, int dist) {
        int count = 1;
        int last = house[0];

        for (int i = 1; i < house.length; i++) {
            if (house[i] - last >= dist) {
                count++;
                last = house[i];
            }
        }
        return count >= C;
    }
}