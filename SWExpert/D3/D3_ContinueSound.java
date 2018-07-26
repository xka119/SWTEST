package SWExpert.D3;

/*
4676. 늘어지는 소리 만들기

실행시간 1등
SubString 사용
*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D3_ContinueSound {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s;
        int l,h;
        int[] len;
        int t = Integer.parseInt(br.readLine().trim());
        for (int tc = 1; tc <= t; tc++) {
            s = br.readLine();
            l = s.length();
            len = new int[l+1];
            h = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<h; i++){
                int temp = Integer.parseInt(st.nextToken());
                if(len[temp]!=0)
                    len[temp]++;
                else
                    len[temp] = 1;
            }

            int index = 0;
            for(int i=0; i<l+1; i++){
                if(len[i]!=0){
                    s = s.substring(0,i+index) + "-" + s.substring(i+index,l+index);
                    len[i]--;
                    i--;
                    index++;

                }else{

                }
            }
            sb.append("#"+tc+" "+s+"\n");


        }
        System.out.print(sb.toString());
    }
}
