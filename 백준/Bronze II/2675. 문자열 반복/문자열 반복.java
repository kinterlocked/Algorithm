import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 0; tc < T; tc++) {
			int a = sc.nextInt();
			String str = sc.next();
			char[] arr = new char[str.length()];
			
			for(int l = 0; l < str.length(); l++) {
				arr[l] = str.charAt(l);
			}
			
			for(int j = 0; j < arr.length; j++) {
				for(int k = 0; k < a; k++) {
					System.out.print(arr[j]);
				}
			}
			System.out.println();
		}
	}
}
