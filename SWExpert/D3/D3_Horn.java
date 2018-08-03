package SWExpert.D3;

import java.io.*;

/*
3142. 영준이와 신비한 뿔의 숲

이차연립방정식 활용 - 간단히 만들기
실행시간 1등과 동일한 답. 내가 더빠른거같은데 확인해야함..
*/
public class D3_Horn {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());
        int n,m;
        for(int tc=1; tc<=t; tc++){
            String[] ss = br.readLine().split(" ");
            n = Integer.parseInt(ss[0]);
            m = Integer.parseInt(ss[1]);

            sb.append("#"+tc+" "+(2*m-n)+" "+(n-m)+"\n");
        }
        System.out.print(sb.toString());

    }
}
