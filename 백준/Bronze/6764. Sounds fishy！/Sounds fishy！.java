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

        int[] real = new int[4];

        for(int i = 0 ; i < 4 ; i++){
            real[i] = sc.nextInt();

        }



        if(real[0] < real[1] && real[1] < real[2] && real[2] < real[3]){
            System.out.println("Fish Rising");
        }
        else if(real[0] > real[1] && real[1] > real[2] && real[2] > real[3]){
            System.out.println("Fish Diving");
        }
        else if(real[0] == real[1] && real[1] == real[2] && real[2] == real[3]){
            System.out.println("Fish At Constant Depth");
        }else{
            System.out.println("No Fish");
        }

    }
}