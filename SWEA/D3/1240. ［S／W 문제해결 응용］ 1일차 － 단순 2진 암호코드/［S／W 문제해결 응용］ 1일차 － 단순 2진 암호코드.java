import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str, tmp, sub = "";
        int[] num = new int[8];
        String[] code = { "0001101", "0011001", "0010011", "0111101", "0100011", "0110001", "0101111", "0111011", "0110111", "0001011" };
 
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
         
 
        for (int tc = 1; tc <= T; tc++) {
            int count = 0;
            boolean isFind = false;
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
 
            for (int n = 0; n < N; n++) {
                str = br.readLine();
                for (int i = M - 1; i >= 0 && !isFind; i--) {
                    if (str.charAt(i) == '1') {
                        sub = str.substring(i - 55, i + 1);
                        isFind = true;
                    }
                }
            }
 
            for (int j = 0; j < sub.length(); j += 7) {
                tmp = sub.substring(j, j + 7);
                for (int l = 0; l < code.length; l++) {
                    if (tmp.equals(code[l])) {
                        num[count++] = l;
                    }
                }
            }
            int rusult = (num[0] + num[2] + num[4] + num[6]) * 3 + num[1] + num[3] + num[5] + num[7];
            if (rusult % 10 == 0) {
                rusult = 0;
                for (int j = 0; j < num.length; j++) {
                    rusult += num[j];
                }
            } else {
                rusult = 0;
            }
            System.out.println("#" + tc + " " + rusult);
        }
    }
}