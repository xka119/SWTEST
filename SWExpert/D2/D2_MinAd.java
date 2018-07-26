package SWExpert.D2;

/*
1204. [S/W 문제해결 기본] 1일차 - 최빈수 구하기

실행시간 2등.
*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class D2_MinAd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int SIZE = 101;
        int t = Integer.parseInt(br.readLine().trim());
        int n;
        ArrayList<Integer> list;
        int[] score;
        int temp;
        int max;
        for(int tc=1; tc<=t; tc++) {
            max = -1;
            list = new ArrayList<>();
            score = new int[SIZE];
            n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                temp = Integer.parseInt(st.nextToken());
                if(score[temp]==0)
                    score[temp] = 1;
                else
                    score[temp]++;
            }
            for(int i=0; i<SIZE; i++){
                if(max<score[i]){
                    max = score[i];
                }
            }
            for(int i=SIZE-1; i>=0; i--){
                if(max<=score[i]) {
                    list.add(i);
                }
            }
            sb.append("#"+tc+" "+list.get(0)+"\n");
        }
        System.out.print(sb.toString());
    }
}