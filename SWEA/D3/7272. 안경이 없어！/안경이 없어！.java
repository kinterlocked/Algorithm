import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		String[] replace1 = { "A", "D", "O", "P", "Q", "R" };
		String[] replace2 = { "C", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "S", "T", "U", "V", "W", "X", "Y",
				"Z" };

		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			String line1 = st.nextToken();
			String line2 = st.nextToken();
			
			line1 = line1.replace("E","C").replace("D", "A").replace("O","A").replace("P", "A").replace("Q", "A").replace("R", "A").replace("F","C")
					.replace("G", "C").replace("H", "C").replace("I", "C").replace("J", "C").replace("K", "C").replace("L", "C").replace("M", "C")
					.replace("N", "C").replace("S", "C").replace("T", "C").replace("U", "C").replace("V", "C").replace("W", "C").replace("X", "C")
					.replace("Y", "C").replace("Z", "C");
			
			line2 = line2.replace("E","C").replace("D", "A").replace("O","A").replace("P", "A").replace("Q", "A").replace("R", "A").replace("F","C")
					.replace("G", "C").replace("H", "C").replace("I", "C").replace("J", "C").replace("K", "C").replace("L", "C").replace("M", "C")
					.replace("N", "C").replace("S", "C").replace("T", "C").replace("U", "C").replace("V", "C").replace("W", "C").replace("X", "C")
					.replace("Y", "C").replace("Z", "C");
			
			if(line1.equals(line2)) {
				System.out.println("#" + tc + " SAME");
			}else {
				System.out.println("#" + tc + " DIFF");
			}

		}
	}
}