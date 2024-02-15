import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str;
		str = sc.next();

		while (!(str.equals("0"))) {
			char[] cArr = str.toCharArray();
			String rstr = "";
			for (int i = 0; i < str.length() / 2; i++) {
				char tmp = cArr[i];
				cArr[i] = cArr[str.length() - 1 - i];
			}
			for (int i = 0; i < cArr.length; i++) {
				rstr += cArr[i];
			}
			if (str.equals(rstr)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			str = sc.next();
		}
	}
}
