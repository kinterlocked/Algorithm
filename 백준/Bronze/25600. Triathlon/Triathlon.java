import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int max = 0;
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int d = sc.nextInt();
			int g = sc.nextInt();
			int score = a * (d + g);
			if(a == d + g) {
				score = 2 * score;
			}
			if(max < score) {
				max = score;
			}
		}
		
		System.out.println(max);
		sc.close();
	}
}