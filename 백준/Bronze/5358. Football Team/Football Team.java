import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Scanner sc =new Scanner(System.in);
        String[] strArr;
        String tmp;  //EoF를 위해, 일단 String에 입력받아서 null인지 아닌지 구분한 다음, 그 다음에 split으로 잘라줘야 함!!!★

        //String[]도 그렇고, StringBuilder도 그렇고, 하나만 만들어놓고 값만 매번 다르게 담아주자. (메모리 ,시간 절약을 위해)

        while (true) { //BufferedReader 이용한 EoF
            //한 줄에 공백없이 들어오는 각 요소를 가르기 위해 StringTokenizer 없이 split 이용함. 당연히 '배열'에 저장해줘야 함!
            if ((tmp= br.readLine())==null) break; //입력도 받고, 입력값이 null인지도 확인하고
            strArr=tmp.split(""); //String[]==null을 할 순 없으니까
            sb.setLength(0); //★StringBuilder 초기화시키는 방법.
            //new StringBuilder()하면 시간과 메모리를 낭비, sb.delete()라는 메소드가 있지만 지우는 개수만큼 시간을 낭비함.
            //단순히 길이를 0으로 지정해주면 초기화된 것과 같은 효과를 가짐
            //System.out.println(strArr[8].getClass().getName()); //type 확인
            for (int i=0; i<strArr.length; i++) {
                if (strArr[i].equals("i")) sb.append("e"); //String끼리 비교할 땐 equals 써야 함!!! 'i' 아닌 "i"넣어줘야 함!
                else if (strArr[i].equals("I")) sb.append("E");
                else if (strArr[i].equals("E")) sb.append("I");
                else if (strArr[i].equals("e")) sb.append("i");
                else sb.append(strArr[i]);
            }
            System.out.println(sb.toString());
        }
    }
}