package SWExpert.D4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
3347. 올림픽 종목 투표

구현문제인듯? 정답률 62퍼
 */
public class D4_3347 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for(int tc=1; tc<=t; tc++){
            String[] ss = br.readLine().split(" ");
            int n = Integer.parseInt(ss[0]);
            int m = Integer.parseInt(ss[1]);
            int[] a = new int[n];
            int[] b = new int[m];

            ss = br.readLine().split(" ");
            for(int i=0; i<n; i++)
                a[i] = Integer.parseInt(ss[i]);

            ss = br.readLine().split(" ");
            for(int i=0; i<m; i++)
                b[i] = Integer.parseInt(ss[i]);

            //default = 0 ;
            int[] vote = new int[n];

            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(a[j]<=b[i]){
                        vote[j]++; break;
                    }
                }
            }
            int max = 0;
            int index = 0;
            for(int i=0; i<n; i++){
                if(vote[i]>max){
                    max = vote[i];
                    index = i;
                }
            }

            sb.append("#"+tc+" "+(index+1)+"\n");
        }
        System.out.print(sb.toString());
    }
}
