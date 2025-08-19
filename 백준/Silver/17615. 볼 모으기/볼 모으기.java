import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String ball = br.readLine();
        int[] count = new int[2];

        int red = 0;
        int blue = 0;
        for(int i = 0; i < ball.length(); i++ ) {
            if(ball.charAt(i) == 'R') {
                count[0]++;
            }else{
                count[1]++;
            }
        }
        for(int i = 0; i < ball.length(); i++ ) {
            if(ball.charAt(i) == 'R') {
                red++;
            }else{
                blue++;
                if(blue == count[1]){
                    break;
                }
            }
        }
        int red2 = 0;
        int blue2 = 0;
        for(int i = 0; i < ball.length(); i++ ) {
            if(ball.charAt(i) == 'B') {
                blue2++;
            }else{
                red2++;
                if(red2 == count[0]){
                    break;
                }
            }
        }
        int red3 = 0;
        int blue3 = 0;
        for(int i = ball.length() - 1; i >= 0; i--) {
            if(ball.charAt(i) == 'R') {
                red3++;
            }else{
                blue3++;
                if(blue3 == count[1]){
                    break;
                }
            }
        }
        int red4 = 0;
        int blue4 = 0;
        for(int i = ball.length() - 1; i >= 0; i--) {
            if(ball.charAt(i) == 'B') {
                blue4++;
            }else{
                red4++;
                if(red4 == count[0]){
                    break;
                }
            }
        }
        int rResult = Math.min(Math.min(red,red2), Math.min(red3, red4));
        int bResult = Math.min(Math.min(blue,blue2), Math.min(blue3, blue4));
        System.out.println(Math.min(rResult, bResult));
    }
}
