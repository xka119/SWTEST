package SWExpert.D2;

/*
1284. 수도 요금 경쟁

StringTokenizer보다 String[] s split한것이 훨씬 빠르다.
언제 String.split을 쓸까?
찾아본 결과...... 횟수가 매우 적을때만 속도가 빠른 듯하다. split은 정규식 쪽 기능면에서 유리
*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D2_WaterCost {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a, p;
        int b,q,r,s;
        int w;

        int t = Integer.parseInt(br.readLine().trim());
        for(int tc=1; tc<=t; tc++) {
            String[] ss = br.readLine().split(" ");
            //p q r s w = 0 1 2 3 4
            p = Integer.parseInt(ss[0]);
            q = Integer.parseInt(ss[1]);
            r = Integer.parseInt(ss[2]);
            s = Integer.parseInt(ss[3]);
            w = Integer.parseInt(ss[4]);

            a = p * w;
            if(r>=w)
                b = q;
            else{
                w -= r;
                b = q + (w*s);
            }

            if(a>b)
                sb.append("#"+tc+" "+b+"\n");
            else
                sb.append("#"+tc+" "+a+"\n");


        }

        System.out.print(sb.toString());

    }
}