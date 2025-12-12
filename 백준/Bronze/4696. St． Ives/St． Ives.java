import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Scanner sc =new Scanner(System.in);
        while(true){
            double n = Double.parseDouble(br.readLine());
            if(n == 0)
                break;

            // 남자, 아내의 수, 아내당 자루 수, 자루당 고양이 수, 그해 로버트가 만난 고양이 수
            System.out.printf("%.2f\n", 1 + n + n*n + n*n*n + n*n*n*n);
        }
    }
}