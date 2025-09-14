import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.sql.SQLOutput;
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

        int time = 0;
        for(int i = 0 ; i < 4; i++){
            time += Integer.parseInt(br.readLine());
        }
        if((1800 - time) >= 300){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}