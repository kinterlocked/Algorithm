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

        int[] problems = {12, 11, 11, 10, 9, 9, 9, 8, 7, 6, 6};
        int[] penalties = {1600, 894, 1327, 1311, 1004, 1178, 1357, 837, 1055, 556, 773};

        int N = Integer.parseInt(br.readLine());
        System.out.println((problems[N - 1] + " " + penalties[N - 1]));
    }
}
