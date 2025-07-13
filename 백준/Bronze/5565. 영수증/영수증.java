import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int money = Integer.parseInt(br.readLine());
        for(int i = 0; i < 9; i++){
           int book = Integer.parseInt(br.readLine());
           money -= book;
        }
        System.out.println(money);
    }
}