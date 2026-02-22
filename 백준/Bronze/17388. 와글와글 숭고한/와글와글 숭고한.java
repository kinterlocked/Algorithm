import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int k = sc.nextInt();
		int h = sc.nextInt();
		
		if(s + k + h >= 100) {
			System.out.println("OK");
		}else {
			if(s >= k && k >= h || k >= s && s >= h) {
				System.out.println("Hanyang");
			}else if(s >= h && h >= k || h >= s && s >= k) {
				System.out.println("Korea");
			}else {
				System.out.println("Soongsil");
			}
		}
		sc.close();
	}
}