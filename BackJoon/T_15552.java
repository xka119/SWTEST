package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
15552. 빠른 A+B

 */

public class T_15552 {
    static String[] ss;
    static StringBuilder sb = new StringBuilder();
    static int a,b;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            ss = br.readLine().split(" ");
            sb.append(Integer.parseInt(ss[0]) + Integer.parseInt(ss[1])+"\n");
        }
        System.out.print(sb.toString());
        br.close();
    }


}

