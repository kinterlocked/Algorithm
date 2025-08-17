import java.io.BufferedReader;
import java.io.InputStreamReader;
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

        HashMap<String, String> map = new HashMap<>();
        map.put("SONGDO","HIGHSCHOOL");
        map.put("CODE","MASTER");
        map.put("2023","0611");
        map.put("ALGORITHM","CONTEST");

        String command = br.readLine();
        System.out.println(map.get(command));
    }
}