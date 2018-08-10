package SWExpert.D3;

/*
3975. 승률 비교하기

실행속도가 인터넷의 영향을 많이 받는건가?? -> 아닌듯.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_WhoisWinner {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());
        double b,a,d,c;

        for(int tc=1; tc<=t; tc++){
            String[] ss = br.readLine().split(" ");
            a = (double)Integer.parseInt(ss[0]);
            b = (double)Integer.parseInt(ss[1]);
            c = (double)Integer.parseInt(ss[2]);
            d = (double)Integer.parseInt(ss[3]);
            if(a/b==c/d){
                sb.append("#"+tc+" DRAW\n");
            }else if(a/b>c/d){
                sb.append("#"+tc+" ALICE\n");
            }else {
                sb.append("#" + tc + " BOB\n");
            }
        }
        System.out.print(sb.toString());
    }


}

