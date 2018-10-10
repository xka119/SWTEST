package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
1051. 숫자 정사각형

정사각형의 최대 범위는 두 길이 n,m중 작은 길이까지만 가능. 4좌표를 탐색 같으면 넓이구하기
길이가 1이면 1+1 * 2 = 넓이


 */

public class T_1051 {
    static int n,m;
    static int[][] map;
    static int ans = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int min = Math.min(n,m);
        map = new int[n][m];
        for(int i=0; i<n; i++){
            String s = br.readLine();
            for(int j=0; j<m; j++)
                map[i][j] = Integer.parseInt(s.charAt(j)+"");
        }

        //정사각형의 길이
        for(int t=1; t<=min; t++){
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(i+t>=n||j+t>=m) continue;
                    if((map[i][j] == map[i][j+t]) && (map[i][j] == map[i+t][j]) && (map[i][j] == map[i+t][j+t])){
                        //4좌표가 같은지 확인하려면
                        ans = (t+1)*(t+1);
                    }
                }
            }
        }

        System.out.print(ans);

    }
}