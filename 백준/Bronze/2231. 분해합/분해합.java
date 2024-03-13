import java.util.*;
import java.io.*;

public class Main{
    public static void main(String []args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int res=0;
        for(int i=1;i<=n;i++){
            int sum=i;
            String str=i+"";
            for(int j=0;j<str.length();j++){
                sum+=str.charAt(j)-'0';
            }
            if(sum==n){
                res=i;
                break;
            }
        }
            System.out.println(res);
    }
    
}