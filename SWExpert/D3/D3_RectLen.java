package SWExpert.D3;

/*
3456. 직사각형 길이 찾기

실행시간1등 메모리1등
*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D3_RectLen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());
        int a,b,c;
        for (int tc = 1; tc <= t; tc++) {
            String[] ss = br.readLine().split(" ");
            a = Integer.parseInt(ss[0]);
            b = Integer.parseInt(ss[1]);
            c = Integer.parseInt(ss[2]);

            //a==b==c -> ==d
            if(a==b && b==c){
                sb.append("#"+tc+" "+b+"\n");
            }else if(a==b && b!=c){
                sb.append("#"+tc+" "+c+"\n");
            }else if(b==c && a!=b){
                sb.append("#"+tc+" "+a+"\n");
            }else if(a==c && b!=a){
                sb.append("#"+tc+" "+b+"\n");
            }
        }
        System.out.print(sb.toString());
    }


}
