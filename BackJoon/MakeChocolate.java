package BackJoon;


/*
2163. 초콜릿 자르기

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MakeChocolate {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n, m;

        String[] ss = br.readLine().split(" ");
        n = Integer.parseInt(ss[0]);
        m = Integer.parseInt(ss[1]);

        int[][] ans = new int[n+1][m+1];

        ans[1][1] = 0;
        int jump = -1;
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                jump++;
                ans[i][j] = jump;
            }
        }

        System.out.print(ans[n][m]);


        /*
        이거말고 공식세워서할 수 있음
        res = n-1 + (m-1)*n
         */
    }
}
