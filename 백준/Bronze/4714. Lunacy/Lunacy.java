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
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        double weight = Double.parseDouble(br.readLine());
        while(weight != -1) {
            double moonWeight = weight * 0.167;
            System.out.println("Objects weighing " + String.format("%.2f", weight) + " on Earth will weigh " + String.format("%.2f", moonWeight) + " on the moon.");
            weight = Double.parseDouble(br.readLine());
        }
    }
}