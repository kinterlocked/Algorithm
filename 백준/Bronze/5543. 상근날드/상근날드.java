import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int burger = Integer.MAX_VALUE;
        for(int i = 0; i < 3; i++){
            int now = Integer.parseInt(br.readLine());
            if(now < burger){
                burger = now;
            }
        }
        int drink = Integer.MAX_VALUE;
        for(int i = 0; i < 2; i++){
            int now = Integer.parseInt(br.readLine());
            if(now < drink){
                drink = now;
            }
        }
        System.out.println((burger + drink) - 50);
    }
}