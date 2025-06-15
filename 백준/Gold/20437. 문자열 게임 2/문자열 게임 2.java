import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int tc = 0; tc < T; tc++) {
            String W = br.readLine();
            int K = Integer.parseInt(br.readLine());
            if(K == 1){
                sb.append("1 1" + "\n");
                continue;
            }

            ArrayList<Integer>[] list = new ArrayList[26];
            int min = Integer.MAX_VALUE;
            int max = -1;
            for(int i = 0; i < 26; i++){
                list[i] = new ArrayList<>();
            }
            for(int i = 0; i < W.length(); i++){
                char ch = W.charAt(i);
                list[ch - 'a'].add(i);
            }
            for(int i = 0; i < list.length; i++){
                if(list[i].size() < K){
                    continue;
                }else{
                    for (int j = 0; j <= list[i].size() - K; j++) {
                        int startIdx = list[i].get(j);
                        int endIdx = list[i].get(j + K - 1);
                        int len = endIdx - startIdx + 1;

                        min = Math.min(min, len);
                        max = Math.max(max, len);
                    }
                }
            }
            if(max == -1){
                sb.append("-1" + "\n");
            }else{
                sb.append(min + " " + max + "\n");
            }
        }
        System.out.println(sb.toString());
    }
}
