import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String game = br.readLine();
        while(!game.equals("end")) {
            int[] count  = new int[3];
            for(int i = 0; i < 9; i++){
                if(game.charAt(i) == 'X') {
                    count[1]++;
                }else if(game.charAt(i) == 'O'){
                    count[2]++;
                }else{
                    count[0]++;
                }
            }
            if (!(count[1] == count[2] || count[1] == count[2] + 1)){
                sb.append("invalid" + "\n");
            }else{
                boolean xPlayer = checkGame('X', game);
                boolean oPlayer = checkGame('O', game);

                if (xPlayer && oPlayer) {
                    sb.append("invalid\n");
                } else if (xPlayer && count[1] == count[2] + 1) {
                    sb.append("valid\n");
                } else if (oPlayer && count[1] == count[2]) {
                    sb.append("valid\n");
                } else if (!xPlayer && !oPlayer && count[0] == 0) {
                    sb.append("valid\n");
                } else {
                    sb.append("invalid\n");
                }
            }
            game = br.readLine();
            if(game.equals("end")) {
                break;
            }
        }
        System.out.println(sb.toString());
    }
    static boolean checkGame(char player, String game) {
        int[][] win = {
                {0,1,2},{3,4,5},{6,7,8},
                {0,3,6},{1,4,7},{2,5,8},
                {0,4,8},{2,4,6}
        };

        for(int[] winChk : win){
            if(game.charAt(winChk[0]) == player &&
                    game.charAt(winChk[1]) == player &&
                    game.charAt(winChk[2]) == player) {
                return true;
            }
        }
        return false;
    }
}
