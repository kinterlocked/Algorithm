import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] rank1 = new int[N + 1];
        int[] rank2 = new int[M + 1];

        int per_rank;

        for(int i = 1; i <= N; i++){
            per_rank = Integer.parseInt(br.readLine());
            if(rank1[per_rank]!= 0){
                for(int j = i; j > per_rank; j--){
                    rank1[j] = rank1[j - 1];
                }
            }
            rank1[per_rank] = i;
        }

        int M2 = M;
        for(int i = 1; i <= M2; i++, M--) {
            per_rank = Integer.parseInt(br.readLine());
            if (rank2[per_rank] != 0) {
                for (int j = i; j > per_rank; j--) {
                    rank2[j] = rank2[j - 1];
                }
            }
            rank2[per_rank] = rank1[M];
        }

        sb.append(rank2[1]).append("\n").append(rank2[2]).append("\n").append(rank2[3]);
        System.out.println(sb.toString());
    }
}