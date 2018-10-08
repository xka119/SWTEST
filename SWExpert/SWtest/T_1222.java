package SWExpert.SWtest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1222. [S/W 문제해결 기본] 6일차 - 계산기1

 */
public class T_1222 {
    static int t = 10;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int len = Integer.parseInt(br.readLine());
            String s = br.readLine();
            int sum = 0;
            for(int i=0; i<s.length(); i+=2)  sum += s.charAt(i) - 48;

            sb.append("#"+tc+" "+sum+"\n");
        }
        System.out.print(sb.toString());


    }


}


