package SWExpert.D3;

/*
4299. 태혁이의 사랑은 타이밍

실행시간1등
*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D3_LoveTiming {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int d,h,m;
        int t = Integer.parseInt(br.readLine().trim());
        for (int tc = 1; tc <= t; tc++) {
            String[] ss = br.readLine().split(" ");

            //11일 11시 11분
            d = Integer.parseInt(ss[0]) - 11;
            h = Integer.parseInt(ss[1]) - 11;
            m = Integer.parseInt(ss[2]) -11;

            if(d<0){
                sb.append("#" + tc + " -1" + "\n");
            }else if(d ==0 && h<0){
                sb.append("#" + tc + " -1" + "\n");
            }else if(d == 0 && h ==0 && m>0){
                sb.append("#" + tc + " -1" + "\n");
            }else{
                sb.append("#" + tc + " "  +((d*60*24)+(h*60)+m) + "\n");
            }
        }
        System.out.print(sb.toString());
    }
}

