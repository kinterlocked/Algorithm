import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[][] cArr = new char[5][15];

		String line;

		for (int i = 0; i < cArr.length; i++) {
			line = br.readLine();
			cArr[i] = line.toCharArray();
		}

//		for (int i = 0; i <15; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (cArr[j][i] != '\u0000') {
//					System.out.print(cArr[j][i]);
//				}
//			}
//		}
		for (int i = 0; i < 15; i++) {
		    for (int j = 0; j < 5; j++) {
		        if (cArr[j].length > i && cArr[j][i] != '\u0000') {
		            System.out.print(cArr[j][i]);
		        }
		    }
		}

		
	}
}
