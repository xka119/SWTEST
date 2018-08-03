package SWExpert.D3;

/*
4047. 영준이의 카드 카운팅

*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D3_CardCounting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());
        final int SIZE = 14;
        int[] s;
        int[] d;
        int[] h;
        int[] c;
        int sa,da,ha,ca;
        String card;
        Boolean error;
        for (int tc = 1; tc <= t; tc++) {
            //덱 초기화
            s = new int[SIZE];
            d = new int[SIZE];
            h = new int[SIZE];
            c = new int[SIZE];
            for(int i=1; i<SIZE; i++){
                s[i] = 1;
                d[i] = 1;
                h[i] = 1;
                c[i] = 1;
            }
            sa=0;da=0;ha=0;ca=0;error=false;
            //카드 입력
            card = br.readLine();
            for(int i=0; i<card.length(); i+=3){
                int tm = Integer.parseInt(card.substring(i+1,i+3));
                if(card.substring(i,i+3).charAt(0)=='S'){
                    if(s[tm]==0){
                        error = true;
                        break;
                    }
                    s[tm] = 0;
                }
                if(card.substring(i,i+3).charAt(0)=='D'){
                    if(d[tm]==0){
                        error = true;
                        break;
                    }
                    d[tm] = 0;
                }
                if(card.substring(i,i+3).charAt(0)=='H'){
                    if(h[tm]==0){
                        error = true;
                        break;
                    }
                    h[tm] = 0;
                }
                if(card.substring(i,i+3).charAt(0)=='C'){
                    if(c[tm]==0){
                        error = true;
                        break;
                    }
                    c[tm] = 0;
                }
            }
            for(int i=1; i<SIZE; i++){
                if(s[i]==1){
                    sa++;
                }
                if(d[i]==1){
                    da++;
                }
                if(h[i]==1){
                    ha++;
                }
                if(c[i]==1){
                    ca++;
                }
            }
            if(error){
                sb.append("#"+tc+" ERROR\n");
            }else{
                sb.append("#"+tc+" "+sa+" "+da+" "+ha+" "+ca+"\n");
            }



        }
        System.out.print(sb.toString());
    }


}
