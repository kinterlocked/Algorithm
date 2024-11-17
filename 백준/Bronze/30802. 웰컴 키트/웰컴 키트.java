import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] count = new int[6];

        int index = 0;
        int max = 0;
        while (st.hasMoreTokens()) {
            count[index++] = Integer.parseInt(st.nextToken());
            if (count[index-1] > max) {
                max = count[index-1];
            }
        }
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int resultAll = 0;
        for (int c : count) {
            resultAll += (c + T - 1) / T;
        }

        int penAll = N / P;
        int temp = N % P;

        System.out.println(resultAll);
        System.out.println(penAll + " " + temp);
    }
}

