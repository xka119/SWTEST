package SWExpert.D3;


/*
1213. [S/W 문제해결 기본] 3일차 - String

String에서 find해주는 함수 indexOf< 같은 String의 위치를 구할 수 있음

정답률 75%
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_String {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int ans,len1,len2;
        String s;
        String ss;
        for(int tc=1; tc<=10; tc++){
            //not used
            int n = Integer.parseInt(br.readLine().trim());
            ans = 0;
            s = br.readLine();
            ss = br.readLine();
            len1 = s.length();
            len2 = ss.length();
            try {
                for (int i = 0; i < len2; i++) {
                    String temp = ss.substring(i, i + len1);
                    if (s.equals(temp))
                        ans++;
                }
            }catch(StringIndexOutOfBoundsException e){
                //무시
            }finally{
                sb.append("#" + tc + " " + ans+"\n");
            }
        }
        System.out.print(sb.toString());
    }
}

