package SWExpert.D3;

/*
3431. 준환이의 운동관리

*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D3_Exercise {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int l,x,u;
        int t = Integer.parseInt(br.readLine().trim());
        for (int tc = 1; tc <= t; tc++) {
            String[] ss = br.readLine().split(" ");
            l = Integer.parseInt(ss[0]);
            u = Integer.parseInt(ss[1]);
            x = Integer.parseInt(ss[2]);

            if(l>x){
                sb.append("#"+tc+" "+ (l-x)+"\n");
            }else if(l<=x && x <= u){
                sb.append("#"+tc+" 0"+"\n");
            }else{
                sb.append("#"+tc+" -1"+"\n");
            }
        }
        System.out.print(sb.toString());
    }


}

