import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		int total = 0;
		
		if(d > a) {
			total += d - a;
		}
		
		if(e > b) {
			total += e - b;
		}
		
		if(f > c) {
			total += f - c;
		}
		
		System.out.println(total);
		sc.close();
	}
}