import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int answer =  1;
		
		for(int i = 0; i < n; i++) {
			answer *= 2;
		}
		
		System.out.println(answer);
		sc.close();
	}
}