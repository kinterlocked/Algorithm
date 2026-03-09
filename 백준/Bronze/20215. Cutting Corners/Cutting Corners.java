import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt();
		int h = sc.nextInt();
		double p = Math.sqrt(w * w + h * h);
		
		System.out.println(String.format("%.9f", w + h - p));
		sc.close();
	}
}