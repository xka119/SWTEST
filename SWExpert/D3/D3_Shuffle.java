package SWExpert.D3;

/*
3499. 퍼펙트 셔플

실행시간1등
*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D3_Shuffle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int t = Integer.parseInt(br.readLine().trim());
        int n,len;
        String[] ss;
        for (int tc = 1; tc <= t; tc++) {
            n = Integer.parseInt(br.readLine());
            ss = br.readLine().split(" ");
            len = ss.length/2;

            //짝수일 때 홀수일 때
            sb.append("#"+tc+" ");
            if(ss.length%2==0){
                for(int i=0; i<len; i++)
                    sb.append(ss[i]+" "+ss[len+i]+" ");
            }else{
                sb.append(ss[0]+" ");
                for(int i=1; i<=len; i++)
                    sb.append(ss[len+i]+" "+ss[i]+ " ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }


}
