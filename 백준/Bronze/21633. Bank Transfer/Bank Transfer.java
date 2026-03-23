import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		double total = 0;
		
		if(25 + n / 100 < 100) {
			total += 100;
		}else if(25 + n / 100 > 2000) {
			total += 2000;
		}else {
			total += 25 + n / 100;
		}
		
		System.out.println(total);
		sc.close();
	}
}
