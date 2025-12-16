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

        int d=sc.nextInt();
        int h=sc.nextInt();
        int m=sc.nextInt();

        int mi=m-11;
        if(mi<0){
            mi+=60;
            h=h-1;
        }
        int ho=h-11;
        if(ho<0){
            ho+=24;
            d=d-1;
        }
        int da=d-11;
        if(da<0){
            System.out.println(-1);
        }
        else{
            System.out.println(da*24*60+ho*60+mi);
        }
    }
}