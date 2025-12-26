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
        BigInteger n=sc.nextBigInteger();

        BigInteger answer=new BigInteger("1");
        for(int i=2;i<=n.intValue();i++){
            answer=answer.multiply(BigInteger.valueOf(i));
            answer=answer.remainder(new BigInteger("10"));
        }

        System.out.println(answer);
    }
}