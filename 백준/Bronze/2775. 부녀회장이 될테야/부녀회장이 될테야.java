import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		
		for(int tc = 0; tc < T; tc++) {
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			// 0층 입력
			int[][] arr = new int[n+1][k+1];
			
			for(int j = 1; j <= arr[0].length - 1; j++) {
				arr[0][j] = j;
			}
			// 층
			for(int i = 1; i <= n; i++) {
				// 호 수
				for(int j = 1; j <= k; j++) {
					int sum = 0;
					for(int l = 1 ; l <= j; l++) {						
						sum += arr[i-1][l];
					}
					arr[i][j] = sum;
					
				}
			}
			System.out.println(arr[n][k]);			
		}
	}
}