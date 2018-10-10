package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
15988. 1, 2, 3 더하기 3

dfs로 풀었는데 시간초과..  dp 문제 였네.. 21억 이상의 수니까 long 으로 구해야댐

 */

public class T_15988 {
    static int t,n;
    static StringBuilder sb = new StringBuilder();
    static long[] ans = new long[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int tc=0; tc<t; tc++){
            n = Integer.parseInt(br.readLine());
            ans[1] = 1;
            ans[2] = 2;
            ans[3] = 4;
            for(int i=4; i<=1000000; i++){
                ans[i] = ans[i-1] + ans[i-2] + ans[i-3];
                ans[i] %= 1000000009;
            }
            sb.append(ans[n]+"\n");

        }
        System.out.print(sb.toString());
    }

}
