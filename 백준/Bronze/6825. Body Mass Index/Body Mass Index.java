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
        double weight = sc.nextDouble();
        double height = sc.nextDouble();
        double BMI = weight / (height * height);

        if(BMI > 25) {
            System.out.println("Overweight");
        }else if(18.5 <= BMI && BMI <= 25) {
            System.out.println("Normal weight");
        }else {
            System.out.println("Underweight");
        }
    }
}