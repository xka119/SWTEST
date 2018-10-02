package SWExpert.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
5356. 의석이의 세로로 말해요

char의 default 값은 \u0000 < == 0 이거는 숫자 0이랑 다르게 인식함 하지만 빈공간과 0은 같게 인식
 */
public class D3_5356 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for(int tc=1; tc<=t; tc++){
            sb.append("#"+tc+" ");

            char[][] arr = new char[5][15];
            //5줄
            for(int i=0; i<5; i++){
                String s = br.readLine();
                for(int j=0; j<s.length(); j++)
                    arr[i][j] = s.charAt(j);
            }

            //출력
            for(int i=0; i<15; i++){
                for(int j=0; j<5; j++)
                    if(arr[j][i]!='\u0000')
                        sb.append(arr[j][i]);
            }
            sb.append("\n");

        }
        System.out.print(sb.toString());
    }
}

