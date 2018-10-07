package SWExpert.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1217. [S/W 문제해결 기본] 4일차 - 거듭 제곱

 */
public class D3_1217 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n,m;

        //시작
        for(int tc=1; tc<=10; tc++ ){
            //입력
            int t = Integer.parseInt(br.readLine());
            String[] ss = br.readLine().split(" ");
            n = Integer.parseInt(ss[0]);
            m = Integer.parseInt(ss[1]);


            sb.append("#"+tc+" "+ (int)Math.pow(n, m)+"\n");
        }

        System.out.print(sb.toString());

    }

}
