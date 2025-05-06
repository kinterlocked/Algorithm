import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Country[] countries = new Country[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());
            countries[i] = new Country(num, gold, silver, bronze);
        }

        Arrays.sort(countries, (a, b) -> {
            if (b.gold != a.gold) return b.gold - a.gold;
            if (b.silver != a.silver) return b.silver - a.silver;
            return b.bronze - a.bronze;
        });

        int rank = 1;
        int targetRank = 1;

        for (int i = 0; i < N; i++) {
            if (i > 0 && (
                countries[i].gold != countries[i - 1].gold ||
                countries[i].silver != countries[i - 1].silver ||
                countries[i].bronze != countries[i - 1].bronze
            )) {
                rank = i + 1;
            }
            if (countries[i].num == K) {
                targetRank = rank;
                break;
            }
        }
        System.out.println(targetRank);
    }
}
class Country {
    int num;
    int gold;
    int silver;
    int bronze;

    Country(int num, int gold, int silver, int bronze) {
        this.num = num;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
    }
}
