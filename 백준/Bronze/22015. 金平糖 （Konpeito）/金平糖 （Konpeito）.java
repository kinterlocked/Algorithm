import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int count = 0;
		int max = Math.max(a, b);
		max = Math.max(max, c);
		
		if(max > a) {
			count += max - a;
		}
		
		if(max > b) {
			count += max - b;
		}
		
		if(max > c) {
			count += max - c;
		}
		
		System.out.println(count);
		sc.close();
	}
}
