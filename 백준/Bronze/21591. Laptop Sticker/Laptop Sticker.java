import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int wc = sc.nextInt();
		int hc = sc.nextInt();
		int ws = sc.nextInt();
		int hs = sc.nextInt();
		
		if(wc - 1 > ws && hc - 1 > hs) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		sc.close();
	}
}