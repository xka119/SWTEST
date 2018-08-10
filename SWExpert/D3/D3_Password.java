package SWExpert.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1234. [S/W 문제해결 기본] 10일차 - 비밀번호

재귀 및 SubString 사용
*/
public class D3_Password {

    static String ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for(int tc=1; tc<=10; tc++){
            String[] ss = br.readLine().split(" ");
            getSecret(ss[1]);

            sb.append("#"+tc+" "+ans+"\n");
        }
        System.out.print(sb.toString());
    }
    public static void getSecret(String s){
        int len = s.length()-1;
        for(int i=0; i<len; i++){
            if(s.charAt(i)==s.charAt(i+1)){
                ans = s.substring(0,i)+s.substring(i+2,s.length());
                getSecret(ans);
                break;
            }
        }

    }

}
