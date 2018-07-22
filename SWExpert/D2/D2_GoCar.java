package SWExpert.D2;

/*
1940. 가랏! RC카!

try ~ catch문으로 입력 예외처리
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_GoCar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int n;
        int[][] input;
        int now;
        int move;
        for (int tc = 1; tc <= t; tc++) {
            n = Integer.parseInt(br.readLine());
            now = 0;
            move = 0;
            input = new int[n][2];
            for(int i=0; i<n; i++){
                st = new StringTokenizer(br.readLine());
                try{
                    for(int j=0; j<2; j++){
                        input[i][j] = Integer.parseInt(st.nextToken());
                    }
                }catch(Exception e){
                    //숫자가 없을시 에러
                }
            }
            int count;
            for(int i=0; i<n; i++){
                count = input[i][0];
                switch (count){
                    case 0:
                        move += now;
                        break;
                    case 1:
                        now += input[i][1];
                        move += now;
                        break;
                    case 2:
                        now -= input[i][1];
                        if(now<0)
                            now = 0;
                        else
                            move += now;
                        break;
                    default:
                        break;
                }

            }
            sb.append("#"+tc+" "+ move + "\n");

        }

        System.out.println(sb.toString());
    }
}